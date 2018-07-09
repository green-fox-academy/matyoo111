package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedditRepository extends CrudRepository<Post, Long> {

  List<Post> findAll();
  List<Post> findAllByOrderByPopularityDesc();
}
