package com.greenfoxacademy.connection_with_mysql.repositories;

import com.greenfoxacademy.connection_with_mysql.models.ToDo;
import com.sun.tools.javac.comp.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

  List<ToDo> findAllByTitleContaining(String title);
  List<ToDo> findByDone(boolean isDone);
  List<ToDo> findAll();
}
