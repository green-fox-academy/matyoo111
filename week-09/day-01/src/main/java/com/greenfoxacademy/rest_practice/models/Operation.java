package com.greenfoxacademy.rest_practice.models;

import java.util.Arrays;

public class Operation {

  private int result;

  public Operation(Integer[] numbers, String operation) {
    if (operation.equals("sum")) {
      result = sumArray(numbers);
    } else if (operation.equals("multiply")) {
      result = multiplyArray(numbers);
    }
  }

  public Operation(int until, String operation) {
    if (operation.equals("sum")) {
      result = addUntil(until);
    } else if (operation.equals("factor")) {
      result = factorUntil(until);
    }
  }

  public Operation(int result) {

    this.result = result;
  }

  public int getResult() {

    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int addUntil(int until) {
    if (until == 1) {
      return 1;
    } else {
      until += addUntil(until - 1);
      return until;
    }
  }

  public int factorUntil(int until) {
    if (until == 1) {
      return 1;
    } else {
      until *= factorUntil(until - 1);
      return until;
    }
  }

  public int sumArray(Integer[] array) {
    return Arrays.stream(array).mapToInt(i -> i.intValue()).sum();
  }

  public int multiplyArray(Integer[] array) {
    return Arrays.stream(array).reduce(1, (a, b) -> a * b);
  }


}
