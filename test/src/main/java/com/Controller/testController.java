package com.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.testoo;

@RestController
public class testController {
	
	@GetMapping("/hello")
	public String test() {
		return "hello";
	}
	
	@GetMapping("/hello1")
	public testoo test1() {
		testoo t = new testoo();
		t.setA(1);
		t.setB(2);
		System.out.println(t);
		System.out.println(1);
		return t;
	}
}
