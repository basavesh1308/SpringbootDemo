package com.basu.springboot.services;

import com.basu.springboot.dto.Topic;
import com.basu.springboot.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList( new Topic("java123", "java", "Java course" ),
            new Topic("dbms123", "DBMS", "database systems")
    ));

    public List<Topic> getAllTopics(){
        List<Topic> topicList = new ArrayList<>();
        topicRepository.findAll().forEach(topicList::add);
        return topicList;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic) {

                topicRepository.save(topic);
            }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
