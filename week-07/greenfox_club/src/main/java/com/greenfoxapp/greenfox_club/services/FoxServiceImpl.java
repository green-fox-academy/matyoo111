package com.greenfoxapp.greenfox_club.services;

import com.greenfoxapp.greenfox_club.models.Fox;
import com.greenfoxapp.greenfox_club.repositories.FoxRepository;
import com.greenfoxapp.greenfox_club.repositories.FoxRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FoxServiceImpl implements FoxService{

  FoxRepository foxRepository;

  @Autowired
  public FoxServiceImpl(FoxRepositoryImpl foxRepository) {
    this.foxRepository = foxRepository;
  }


  @Override
  public void logIn(String name) {
    if (foxRepository.findByName(name) == null) {
      foxRepository.save(new Fox(name));
    }
  }

  @Override
  public Fox getFox(String name) {
    return foxRepository.findByName(name);
  }

  @Override
  public Map<String, Fox> getFoxList() {
    return foxRepository.getFoxList();
  }
}
