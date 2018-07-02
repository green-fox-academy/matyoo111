package com.greenfoxapp.greenfox_club.controllers;

import com.greenfoxapp.greenfox_club.models.Fox;
import com.greenfoxapp.greenfox_club.services.FoxService;
import com.greenfoxapp.greenfox_club.services.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

  private FoxService foxService;


  @Autowired
  public MainController(FoxServiceImpl foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String renderMainPage(Model model) {
    Fox mrFox = new Fox();
    model.addAttribute("fox", mrFox);
    model.addAttribute("instruction", "Log in to create your own fox " + "and learn some tricks!");
    return "index";
  }


  @GetMapping("/login")
  public String loginGet() {
    return "login";
  }

  @PostMapping("/login")
  public String loginPost(@RequestParam("name") String name) {
    foxService.logIn(name);
    return "redirect:/" + name;
  }

  @GetMapping("/{name}")
  public String showIndexWithName(@PathVariable(value = "name", required = false) String name, Model model) {

      if (! (name == null)) {
        model.addAttribute("fox", foxService.getFox(name));
      } else {
        model.addAttribute("fox", new Fox());
        return "index";
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
    try {
      foxService.getFox(name).setDrink(drink);
      foxService.getFox(name).setFood(food);
      return "redirect:/" + name;
    } catch (Exception e) {
      return "redirect:/";
    }
  }

  @GetMapping("{name}/trickCenter")
  public String showTrickCenter(Model model, @PathVariable(value = "name") String name) {
    model.addAttribute("fox", name);
    return "trickCenter";
  }

  @PostMapping("{name}/trickcenter")
  public String addTrick(@RequestParam("trick") String trick, @PathVariable("name") String name) {
    try {
      boolean isTrickKnown = false;
      for (String knownTricks : foxService.getFox(name).getListOfTricks()) {
        if (knownTricks.equals(trick)) {
          isTrickKnown = true;
        }
      }
      if (!(isTrickKnown)) {
        foxService.getFox(name).addTrick(trick);
      }
      return "redirect:/" + name;
    } catch (Exception e) {
      return "redirect:/";
    }
  }

  @GetMapping("{name}/information")
  public String renderInformation(Model model, @RequestParam(value = "name", required = false) String name) {
    List<Fox> foxesList = new ArrayList<Fox>(foxService.getFoxList().values());
    model.addAttribute("foxes", foxesList);
    return "information";
  }

}