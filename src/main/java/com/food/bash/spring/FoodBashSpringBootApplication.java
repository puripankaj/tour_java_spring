package com.food.bash.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class FoodBashSpringBootApplication {

	@RequestMapping("/")
	@ResponseBody
	   String home() {
	      return "Welcome FoodBash!";
	   }
	
	public static void main(String[] args) {
		SpringApplication.run(FoodBashSpringBootApplication.class, args);
	}

}
