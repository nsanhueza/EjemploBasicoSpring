package cl.nsanhueza.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
	@RequestMapping("/hello")
    public String helloWorld() {
		return "Hello World";	 
	}
}
