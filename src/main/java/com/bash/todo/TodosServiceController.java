/**
 * 
 */
package com.bash.todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bash.todo.model.TodoEntity;
import com.bash.todo.repository.TodoRepository;

/**
 * @author purip
 *
 */
@CrossOrigin("*")
@ComponentScan
@RestController
public class TodosServiceController {
	private static Map<String, Todo> todoRepo = new HashMap<>();
	private static Todo todo =null;
	
	@Autowired    
	private TodoRepository todoRepository;
	
	 static {
		 todo = new Todo();
		 todo.setUserId("1");
		 todo.setId("1");
	     todo.setTitle("Work on House");
	     todoRepo.put(todo.getId(), todo);
	    
	   }
	
	   @RequestMapping(value = "/todos")
	   public ResponseEntity<Object> getTodos() {
		   List<TodoEntity> todoEntities = new ArrayList<>(); 
		   todoRepository.findAll().forEach(todoEntities::add); 
	      return new ResponseEntity<>(todoEntities, HttpStatus.OK);
	   }
	   
	   @RequestMapping(value = "/todos/{id}", method = RequestMethod.PUT)
	   public ResponseEntity<Object> updateTodos(@PathVariable("id") String id, @RequestBody Todo todo) { 
		  todoRepo.get(id).setCompleted(todo.isCompleted());
	     
	      return new ResponseEntity<>(todoRepo.get(id), HttpStatus.OK);
	   } 
	   
	   @RequestMapping(value = "/todos", method = RequestMethod.POST)
	   public ResponseEntity<Object> addTodo(@RequestBody TodoEntity todoEntity) {
			/*
			 * todo.setUserId("1"); String id = ""+ todoRepo.size() + 1; todo.setId(id);
			 * todoRepo.put(id, todo); return new ResponseEntity<>(todo,
			 * HttpStatus.CREATED);
			 */
		    
		   todoEntity.setUserId("1"); 
		   long count = todoRepository.count();
		   String id = ""+ count + 1; 
		   todoEntity.setId(id);
		   todoRepository.save(todoEntity); 
		   
		   return new ResponseEntity<>(todoEntity, HttpStatus.CREATED);
	   }
	   
	   @RequestMapping(value = "/todos/{id}", method = RequestMethod.DELETE)
	   public ResponseEntity<Object> delete(@PathVariable("id") String id) { 
		  Todo todoDelete = todoRepo.get(id);
		  todoRepo.remove(id);
	      return new ResponseEntity<>(todoDelete, HttpStatus.OK);
	   }

}
