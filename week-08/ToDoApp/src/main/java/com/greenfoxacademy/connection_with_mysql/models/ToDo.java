package com.greenfoxacademy.connection_with_mysql.models;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;
  private Timestamp creationDate;
  private Timestamp dueDate;


  @ManyToOne(cascade=CascadeType.ALL)
  @NotFound(action = NotFoundAction.IGNORE)
  private Assignee assignee = new Assignee();


  public ToDo (String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
    assignee = null;
    creationDate = new Timestamp(System.currentTimeMillis());
    dueDate = null;
  }

  public ToDo() {
    this.title = "unknown";
  }

  public ToDo(String task) {
    this.title = task;
    assignee = null;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public Timestamp getCreationDate() {
    return creationDate;
  }

  public Timestamp getDueDate() {
    return dueDate;
  }

  public void setDueDate(Timestamp dueDate) {
    this.dueDate = dueDate;
  }
}
