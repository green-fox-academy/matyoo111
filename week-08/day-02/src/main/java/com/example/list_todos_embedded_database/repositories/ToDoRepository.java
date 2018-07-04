package com.example.list_todos_embedded_database.repositories;

import com.example.list_todos_embedded_database.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
