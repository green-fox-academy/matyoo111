package com.example.list_todos_embedded_database;

import com.example.list_todos_embedded_database.models.ToDo;
import com.example.list_todos_embedded_database.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListTodosEmbeddedDatabaseApplication implements CommandLineRunner {

  @Autowired
  ToDoRepository toDoRepository;

  public static void main(String[] args) {
    SpringApplication.run(ListTodosEmbeddedDatabaseApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    toDoRepository.save(new ToDo("Do sth"));
  }
}
