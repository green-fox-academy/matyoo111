package com.greenfoxacademy.connection_with_mysql.models;

import javax.persistence.*;

@Entity
public class Assignee {

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public ToDo getTodo() {
    return todo;
  }

  public void setTodo(ToDo todo) {
    this.todo = todo;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String email;

  @ManyToOne
  private ToDo todo;

  public Assignee() {
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
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
