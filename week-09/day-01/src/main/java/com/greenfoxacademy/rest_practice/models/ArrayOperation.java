package com.greenfoxacademy.rest_practice.models;

import java.util.Arrays;

public class ArrayOperation {

  private int[] result;

  public ArrayOperation(Integer[] numbers) {
    result = doubleArray(numbers);
  }

  public ArrayOperation(int[] result) {

    this.result = result;
  }

  public int[] getResult() {

    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }



  public int[] doubleArray(Integer[] array) {
    return Arrays.stream(array).mapToInt(i -> i.intValue() * 2).toArray();
  }
}
