package com.greenfoxacademy.connection_with_mysql;

import com.greenfoxacademy.connection_with_mysql.models.ToDo;
import com.greenfoxacademy.connection_with_mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMysqlApplication implements CommandLineRunner {

  @Autowired
  ToDoRepository toDoRepository;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionWithMysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    //toDoRepository.save(new ToDo("Do shopping"));
    //toDoRepository.save(new ToDo("Buy milk", true, false));
  }
}
