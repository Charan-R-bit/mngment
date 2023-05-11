package com.accountmng.micro.amcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AMController 
{
	@Value("${employee.name}")
	private String name;
	@GetMapping("/check")
	public String check()
	{
		System.out.println(name);
		return name;
	}
}
