package com.greenfoxapp.greenfox_club.controllers;

import com.greenfoxapp.greenfox_club.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.nio.file.Path;
import java.util.*;

@Controller
public class MainController {

  private Map<String, Fox> foxes;


  public MainController() {
    foxes = new HashMap<>();
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    Fox mrFox = new Fox("Mr.Fox", null, "pizza", "lemonade");
    model.addAttribute("fox", mrFox);
    return "index";
  }


  @GetMapping("/login")
  public String loginGet() {
    return "login";
  }

  @PostMapping("/login")
  public String loginPost(@RequestParam("name") String name) {
    foxes.put(name, new Fox(name));
    return "redirect:/" + name;
  }

  @GetMapping("/{name}")
  public String showIndexWithName(@PathVariable("name") String name, Model model) {
    if (! (name == null)) {
      model.addAttribute("fox", foxes.get(name));
    } else {
      model.addAttribute("fox", new Fox("Mr.Foxy", null, "pizza", "lemondae"));
    }
    return "index";
  }

  @GetMapping("{name}/nutritionStore")
  public String showNutritionStore(Model model, @PathVariable(value = "name") String name) {
    model.addAttribute("fox", name);
    return "nutritionStore";
  }

  @PostMapping("{name}/nutritionStore")
  public String setFoodDrink(@RequestParam("food") String food, @RequestParam("drink") String drink, @PathVariable("name") String name) {
    foxes.get(name).setFood(food);
    foxes.get(name).setDrink(drink);
    return "redirect:/" + name;
  }

  @GetMapping("{name}/trickCenter")
  public String showTrickCenter(Model model, @PathVariable(value = "name") String name) {
    model.addAttribute("fox", name);
    return "trickCenter";
  }

  @PostMapping("{name}/trickcenter")
  public String addTrick(@RequestParam("trick") String trick, @PathVariable("name") String name) {
    foxes.get(name).addTrick(trick);

    return "redirect:/" + name;
  }


}
