package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RedditController {

  RedditRepository redditRepository;

  @Autowired
  public RedditController(RedditRepository redditRepository) {
    this.redditRepository = redditRepository;
  }

  @GetMapping("")
  public String renderIndex(Model model) {
    model.addAttribute("posts", redditRepository.findAllByOrderByPopularityDesc());
    return "index";
  }

  @GetMapping("/add")
  public String renderAddPage(Model model) {
    model.addAttribute("post", new Post());
    return "add";
  }

  @PostMapping("/add")
  public String addNewReddit(@ModelAttribute Post post) {
    redditRepository.save(post);
    return "redirect:/";
  }

  @PostMapping("/increase/{id}")
  public String increasePopularity(@PathVariable("id") long id) {
    redditRepository.findById(id).get().setPopularity(redditRepository.findById(id).get().getPopularity() + 1);
    redditRepository.save(redditRepository.findById(id).get());
    return "redirect:/";
  }

  @PostMapping("/decrease/{id}")
  public String decreasePopularity(@PathVariable("id") long id) {
    redditRepository.findById(id).get().setPopularity(redditRepository.findById(id).get().getPopularity() - 1);
    redditRepository.save(redditRepository.findById(id).get());
    return "redirect:/";
  }
}
