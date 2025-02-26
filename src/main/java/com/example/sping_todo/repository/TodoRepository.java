package com.example.sping_todo.repository;

import com.example.sping_todo.dto.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
