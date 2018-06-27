package com.greenfoxacademy.dependencies_practice;

import com.greenfoxacademy.dependencies_practice.services.BlueColor;
import com.greenfoxacademy.dependencies_practice.services.Printer;
import com.greenfoxacademy.dependencies_practice.services.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesPracticeApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(DependenciesPracticeApplication.class, args);
  }

  @Autowired
  RedColor redColor;

  @Autowired
  BlueColor blueColor;


  @Override
  public void run(String... args) throws Exception {
    blueColor.printColor();
    redColor.printColor();
  }
}
