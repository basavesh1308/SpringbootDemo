package com.basu.springboot.repository;

import com.basu.springboot.dto.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
