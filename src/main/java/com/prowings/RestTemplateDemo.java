package com.prowings;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateDemo {

	public static void main(String[] args) {

//		RestTemplate restTemplate = new RestTemplate();
//
//		Student std = restTemplate.getForObject("http://localhost:8080/Student_REST_API_using_Spring_MVC/students",
//				Student.class);
//		System.out.println(std);
		
		

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<Student>> responseEntity = restTemplate.exchange(
				"http://localhost:8080/Student_REST_API_using_Spring_MVC/students", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Student>>() {
					
					
					
				});

		List<Student> students = responseEntity.getBody();
		students.forEach(System.out::println);

	}

}
