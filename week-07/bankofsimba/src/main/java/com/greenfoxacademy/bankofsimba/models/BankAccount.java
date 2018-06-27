package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private boolean isGoodGuy;

  public boolean isGoodGuy() {
    return isGoodGuy;
  }

  public void setGoodGuy(boolean goodGuy) {
    isGoodGuy = goodGuy;
  }

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    isKing = false;
    isGoodGuy = true;
  }

  public BankAccount(String name) {
    this.name = name;
    balance = 100;
    animalType = "unknown";
    isKing = false;
    isGoodGuy = true;
  }

  public BankAccount() {
    name = "unknown";
    balance = 100;
    animalType = "unknown";
    isKing = false;
    isGoodGuy = true;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public BankAccount(String name, int balance, String animalType, boolean isKing, boolean isGoodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGoodGuy = isGoodGuy;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}
