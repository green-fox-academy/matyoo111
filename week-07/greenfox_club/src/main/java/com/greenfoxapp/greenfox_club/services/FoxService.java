package com.greenfoxapp.greenfox_club.services;

import com.greenfoxapp.greenfox_club.models.Fox;

import java.util.List;
import java.util.Map;

public interface FoxService {

  void logIn(String name);
  Fox getFox(String name);
  Map<String, Fox> getFoxList();
}
