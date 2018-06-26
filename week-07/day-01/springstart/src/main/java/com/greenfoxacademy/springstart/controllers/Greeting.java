package com.greenfoxacademy.springstart.controllers;

public class Greeting {

  long id;
  String content;

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public Greeting(String content, long id) {
    this.id = id;
    this.content = content;
  }

  public Greeting(String content) {
    this.id = id;
    this.content = content;
  }
}
