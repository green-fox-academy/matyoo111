package com.greenfoxacademy.connection_with_mysql.repositories;

import com.greenfoxacademy.connection_with_mysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
