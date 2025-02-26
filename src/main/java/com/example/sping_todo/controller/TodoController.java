package com.example.sping_todo.controller;

import com.example.sping_todo.dto.Todo;
import com.example.sping_todo.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin("*")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    @PostMapping("/{id}")
    public Todo updateTodo(@RequestBody Todo todo) {
        return todoService.updateTodo(todo);
    }

    @DeleteMapping( "/api/todos/{id}")
    public void deleteTodo(@PathVariable("id") Long id) {
        todoService.deleteTodo(id);
    }
}
