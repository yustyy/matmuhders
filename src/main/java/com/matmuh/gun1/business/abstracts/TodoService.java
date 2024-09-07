package com.matmuh.gun1.business.abstracts;

import com.matmuh.gun1.entities.Todo;

import java.util.List;

public interface TodoService {

    void addTodo(Todo todo);

    void deleteTodo(int id);

    Todo getTodoById(int id);

    List<Todo> getAllTodos();

}
