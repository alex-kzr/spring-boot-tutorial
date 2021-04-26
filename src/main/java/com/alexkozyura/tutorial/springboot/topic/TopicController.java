package com.alexkozyura.tutorial.springboot.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {

        return Arrays.asList(
                new Topic("spring", "Spring Framework","Spring Framework D"),
                new Topic("java", "Core Java", "Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        );
    }

    
}
