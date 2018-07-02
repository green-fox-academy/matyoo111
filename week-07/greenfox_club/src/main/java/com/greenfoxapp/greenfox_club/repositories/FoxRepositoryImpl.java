package com.greenfoxapp.greenfox_club.repositories;

import com.greenfoxapp.greenfox_club.models.Fox;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Primary
@Component
public class FoxRepositoryImpl implements FoxRepository {


  private Map<String, Fox> foxes;

  public Map<String, Fox> getFoxes() {
    return foxes;
  }

  public FoxRepositoryImpl() {
    this.foxes = new HashMap<>();
  }

  @Override
  public Fox findByName(String name) {
    return foxes.get(name);
  }

  @Override
  public void save(Fox fox) {
    foxes.put(fox.getName(), fox);
  }

  @Override
  public Map<String, Fox> getFoxList() {
    return foxes;
  }

}
