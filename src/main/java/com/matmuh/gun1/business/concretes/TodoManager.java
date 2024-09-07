package com.matmuh.gun1.business.concretes;

import com.matmuh.gun1.business.abstracts.TodoService;
import com.matmuh.gun1.dataAccess.TodoDao;
import com.matmuh.gun1.entities.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoManager implements TodoService {

    private final TodoDao todoDao;

    //dependency injection

    public TodoManager(TodoDao todoDao) {
        this.todoDao = todoDao;
    }


    @Override
    public void addTodo(Todo todo) {
        todoDao.save(todo);
        System.out.println("veritabanına todo kaydedildi!");
    }

    @Override
    public void deleteTodo(int id) {
        Todo veritabanindanAldigimTodo = todoDao.findById(id).get();

        todoDao.delete(veritabanindanAldigimTodo);

        System.out.println("todo veritabanından silindi!");
    }

    @Override
    public Todo getTodoById(int id) {
        Todo veritabanindanAldigimTodo = todoDao.findById(id).get();

        System.out.println("id ile todo getirildi!");

        return veritabanindanAldigimTodo;
    }

    @Override
    public List<Todo> getAllTodos() {
        List<Todo> veritabanindanAldigimTodolar = todoDao.findAll();

        System.out.println("tüm todolar getirildi!");

        return veritabanindanAldigimTodolar;
    }
}
