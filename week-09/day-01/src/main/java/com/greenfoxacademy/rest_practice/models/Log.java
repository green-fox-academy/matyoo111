package com.greenfoxacademy.rest_practice.models;

import java.util.Date;

public class Log {

  private Date createdAt;
  private String endPoint;
  private String data;

  public Log() {
  }

  public Log(Date createdAt, String endPoint, String data) {

    this.createdAt = createdAt;
    this.endPoint = endPoint;
    this.data = data;
  }

  public Date getCreatedAt() {

    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
