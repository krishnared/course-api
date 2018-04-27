package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	// The @RequestMapping maps only to the Get Method by default
	// To Map to other Http Methods you'll specify it in the annotations
	public String sayHi() {
		return "Hi";
	}
}
