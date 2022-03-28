package com.maybank.crud.service;

import java.util.List;

import com.maybank.crud.entitiy.Todo;



public interface TodoService {
	List<Todo> listAll();
	
	Todo getTodoById(int id);
	Todo saveTodo(Todo todo);
	Todo updateTodo(Todo todo);
	String deleteTodo(int id);
}

