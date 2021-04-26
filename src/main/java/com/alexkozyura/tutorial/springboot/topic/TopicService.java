package com.alexkozyura.tutorial.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
        new Topic("spring", "Spring Framework","Spring Framework D"),
        new Topic("java", "Core Java", "Java Description"),
        new Topic("javascript", "JavaScript", "JavaScript Description")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }
}
