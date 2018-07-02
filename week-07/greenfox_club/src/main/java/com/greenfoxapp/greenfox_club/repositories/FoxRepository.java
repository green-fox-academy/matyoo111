package com.greenfoxapp.greenfox_club.repositories;

import com.greenfoxapp.greenfox_club.models.Fox;

import java.util.List;
import java.util.Map;

public interface FoxRepository {

  Fox findByName(String name);
  void save(Fox fox);

  Map<String, Fox> getFoxList();
}
