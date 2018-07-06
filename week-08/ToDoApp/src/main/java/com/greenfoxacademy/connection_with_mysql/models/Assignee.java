package com.greenfoxacademy.connection_with_mysql.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String email;

  @OneToMany(mappedBy = "assignee")
  private List<ToDo> todos = new ArrayList<>();



  public Assignee() {
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<ToDo> getTodos() {
    return todos;
  }

  public void setTodos(List<ToDo> todos) {
    this.todos = todos;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
