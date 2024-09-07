package com.matmuh.gun1.webAPI;

import com.matmuh.gun1.business.abstracts.TodoService;
import com.matmuh.gun1.entities.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/todos")
public class TodosController {

    //dependency injection yapmam gerekiyor

    private final TodoService todoService;

    public TodosController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/addTodo")
    public void addTodo(@RequestBody Todo todo){
        todoService.addTodo(todo);
    }

    //api/todos/deleteTodo/2
    //burdaki 2 bir path variabledır

    @DeleteMapping("/deleteTodo/{id}")
    public void deleteTodo(@PathVariable int id){
        todoService.deleteTodo(id);
    }

    @GetMapping("/getTodoById/{id}")
    public Todo getTodoById(@PathVariable int id){
        return todoService.getTodoById(id);
    }

    @GetMapping("/getAllTodos")
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

}
