package com.example.democrud.repository;

import com.example.democrud.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
