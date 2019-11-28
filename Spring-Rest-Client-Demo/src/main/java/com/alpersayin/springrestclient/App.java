package com.alpersayin.springrestclient;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.alpersayin.springrestclient.entity.Department;

public class App 
{
	static final String restURI = "http://localhost:8081/Spring-REST-API/api/departments";
	static RestTemplate restTemplate = new RestTemplate();
	
    public static void main( String[] args )
    {
        System.out.println( "REST Çağrılar başlıyor.." );
        
        Department dept = null, dept10;
        
        dept10 = getDepartment(10);
        System.out.println("Dept: ");
        System.out.println(dept);
        
        System.out.println("Ekleniyor..");
        dept = new Department();
        dept.setDeptName("Test");
        //saveDepartment(dept);
        
        System.out.println("Güncelleniyor..");
        dept10.setDeptName("Yonetim");
        saveDepartment(dept10);
        
        System.out.println("Siliniyor..");
        deleteDepartment(827);
        
        System.out.println("List: ");
        List<Department> depts = getDepartments();
        for (Department department : depts) {
			System.out.println(department);
		}
    }
    
	private static void deleteDepartment(int deptId) {
		restTemplate.delete(restURI + "/" + deptId);
		System.out.println(deptId + " silindi..");
	}
	
	private static void saveDepartment(Department dept) {
		int deptId = dept.getId();
		
		if (deptId == 0) {
			// inserting
			restTemplate.postForEntity(restURI, dept, Department.class);
		} else {
			// updating
			restTemplate.put(restURI, dept);
		}
	}

	private static Department getDepartment(int deptId) {
        return restTemplate.getForObject(restURI + "/" + deptId, Department.class);
	}
	
	private static List<Department> getDepartments() {
		
		ResponseEntity<List<Department>> responseEntity = restTemplate.exchange(restURI, HttpMethod.GET, null, 
				new ParameterizedTypeReference<List<Department>>() {} );
		List<Department> depts = responseEntity.getBody();
		
		/* Diger Yontem
		ResponseEntity<Department[]> responseEntity = restTemplate.getForEntity(restURI, Department[].class);
		Department[] depts = responseEntity.getBody();
		*/
		
		return depts;
	}
//	
}
