package com.example.hello.random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
	
	private MyRandom random;

	@Autowired
	public NumberController(MyRandom random) {
		this.random = random;
	}

	@GetMapping("/number")
	public NumberControllerResponse randomNumber() {
		int result = this.random.nextInt(10); 
		return new NumberControllerResponse(result + "");
	}
	
}
