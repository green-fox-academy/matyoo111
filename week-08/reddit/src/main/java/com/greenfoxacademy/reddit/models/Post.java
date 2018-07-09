package com.greenfoxacademy.reddit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

  private String title;
  private String postURL;
  private int popularity;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  public Post() {
  }

  public Post(String title, String url) {
    this.title = title;
    this.postURL = url;
    this.popularity = 0;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return postURL;
  }

  public void setUrl(String url) {
    this.postURL = url;
  }

  public int getPopularity() {
    return popularity;
  }

  public void setPopularity(int popularity) {
    this.popularity = popularity;
  }

  public long getId() {
    return id;
  }

  public void addValue() {
    popularity--;
  }

  public void setId(long id) {
    this.id = id;
  }
}
