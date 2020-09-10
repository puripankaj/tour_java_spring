package com.bash.todo.repository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bash.todo.model.TodoEntity; 


@Repository
public interface TodoRepository extends CrudRepository<TodoEntity, String>   
{    
}    
