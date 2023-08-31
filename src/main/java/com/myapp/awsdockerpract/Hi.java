package com.myapp.awsdockerpract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {
	@GetMapping(value="/hi")
	public String getHi() {
		return "Hi vijay welcome to Awsproject";
	}

}
