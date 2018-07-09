package com.greenfoxacademy.rest_practice.models;

public class ErrorHandling {

  private String error;



  public ErrorHandling() {
  }

  public ErrorHandling(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
