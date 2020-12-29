package com.basu.springboot.controllers;

import com.basu.springboot.dto.Topic;
import com.basu.springboot.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();
    }

    @RequestMapping("topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic){
        topicService.updateTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
