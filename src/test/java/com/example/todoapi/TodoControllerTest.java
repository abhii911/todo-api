package com.example.todoapi;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TodoControllerTest {

    @Test
    void listStartsEmpty() {
        assertTrue(new TodoController().getTodos().isEmpty());
    }

    @Test
    void addTodoStoresItem() {
        TodoController c = new TodoController();
        c.addTodo("buy milk");
        assertEquals(1, c.getTodos().size());
    }

    @Test
    void addTodoReturnsMessage() {
        assertEquals("Added: milk", new TodoController().addTodo("milk"));
    }
}