package com.example.todoapi;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final List<String> todos = new ArrayList<>();

    @GetMapping
    public List<String> getTodos() {
        return todos;
    }

    @PostMapping
    public String addTodo(@RequestBody String todo) {
        todos.add(todo);
        return "Added: " + todo;
    }
}