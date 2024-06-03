package com.rays.ctl;

import java.util.HashMap;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.ORSResponse;
import com.rays.common.SpringResponse;
import com.rays.dto.UserDTO;

@RestController
@RequestMapping(value = "Test")
public class TestCtl {

	@GetMapping
	public SpringResponse display() {
		
		SpringResponse res = new SpringResponse();

	res.setMessage("In the Display method");
	
	UserDTO dto = new UserDTO();
	dto.setId(100L);
	dto.setFirstName("Shubham");
	dto.setLastName("Nagwanshi");
	dto.setLogin("shubh@gmail.com");
	dto.setPassword("shubh123");
	
	Map map = new HashMap();
	map.put("dto", dto);
	
	res.setResult(map);
		return res;
	}
	
	@GetMapping("testORSResponse")
	public ORSResponse testORSResponse() {
		ORSResponse res = new ORSResponse();
		
		Map errors = new HashMap();
		
		
		errors.put("firstName", "First name is required");
		errors.put("lastName", "Last name is required");
		errors.put("loginId", "Login Id is required");
		errors.put("password", "Password name is required");
		
		res.addInputError(errors);
		
		UserDTO dto = new UserDTO();
		dto.setId(100L);
		dto.setFirstName("Shubham");
		dto.setLastName("Nagwanshi");
		dto.setLogin("shubh@gmail.com");
		dto.setPassword("shubh123");
		
		res.addData(dto);
		
		res.addMessage("login & password Invalid");
		
		res.addResult("hi", "Shubham");
		return res;
	}
	
}
