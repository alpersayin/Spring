package com.alpersayin.jsondemo;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
/* Jackson Demo*/

public class App 
{
    public static void main( String[] args ) throws UnsupportedEncodingException
    {
        ObjectMapper mapper = new ObjectMapper();
        Department dept;
          
        try {
			dept = mapper.readValue(new File("data/departmanlar.json"), Department.class);
			System.out.println(dept);
			
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(new File("data/output.json"), dept);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        
    //    
    }
//    
}
