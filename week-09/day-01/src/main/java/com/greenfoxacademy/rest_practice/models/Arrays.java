package com.greenfoxacademy.rest_practice.models;

public class Arrays {

  private String what;
  private Integer[] numbers;

  public Arrays() {
  }

  public Arrays(String what, Integer[] numbers) {

    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {

    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }
}
