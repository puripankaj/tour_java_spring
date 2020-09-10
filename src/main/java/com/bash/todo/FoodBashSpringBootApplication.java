package com.bash.todo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class FoodBashSpringBootApplication {
	
	private static Map<String, Todo> todoRepo = new HashMap<>();
	
	/*
	 * static { Todo todo = new Todo(); todo.setUserId("1"); todo.setId("1");
	 * todo.setTitle("Work on House"); todoRepo.put(todo.getId(), todo);
	 * 
	 * }
	 * 
	 * @RequestMapping(value = "/getTodos") public ResponseEntity<Object> getTodo()
	 * { return new ResponseEntity<>(todoRepo.values(), HttpStatus.OK); }
	 * 
	 * @RequestMapping("/")
	 * 
	 * @ResponseBody String home() { //return welcome message return
	 * "Welcome FoodBash!"; }
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(FoodBashSpringBootApplication.class, args);
	}

}
