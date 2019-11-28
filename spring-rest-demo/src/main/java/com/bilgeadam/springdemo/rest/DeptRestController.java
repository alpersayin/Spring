package com.bilgeadam.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bilgeadam.springdemo.entity.Department;

@RestController
@RequestMapping("/dept")
public class DeptRestController {

	List<Department> list;
	
	@GetMapping("/list")
	public List<Department> getDeptList() {	
		return list;
	}

	@GetMapping("/list/{deptId}")
	public Department getDept(@PathVariable Integer deptId) {
		
		if (deptId >= list.size() || deptId < 0)
			throw new DepartmentNotFoundException("Department Id can not be found : " + deptId);
		
		return list.get(deptId);

	}
	
	@PostConstruct
	public void loadData() {
		list = new ArrayList<>();
		list.add(new Department(10, "Muhasebe", "Ömer Karakaş" ));
		list.add(new Department(20, "Üretim", "Üretken Demirbaş" ));
		list.add(new Department(30, "İdari İşler", "Amir Amiroğlu" ));
	}
		
	
	
}
