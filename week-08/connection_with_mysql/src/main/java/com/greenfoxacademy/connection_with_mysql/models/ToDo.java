package com.greenfoxacademy.connection_with_mysql.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  @OneToMany(mappedBy = "todo")
  private List<Assignee> assignees = new ArrayList<>();

  public List<Assignee> getAssignees() {
    return assignees;
  }

  public void setAssignees(List<Assignee> assignees) {
    this.assignees = assignees;
  }

  public void addAssignees(Assignee assignee) {
    assignees.add(assignee);
  }

  public ToDo (String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public ToDo() {
    this.title = "unknown";
  }

  public ToDo(String task) {
    this.title = task;
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
}
