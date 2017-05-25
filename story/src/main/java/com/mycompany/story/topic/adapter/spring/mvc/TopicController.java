package com.mycompany.story.topic.adapter.spring.mvc;

import com.mycompany.story.topic.application.TopicCommand;
import com.mycompany.story.topic.application.TopicParameter;
import com.mycompany.story.topic.application.TopicResult;
import com.mycompany.story.topic.application.TopicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2017/5/13.
 */
@Controller
public class TopicController {

    @Resource
    private TopicService topicService;

    @RequestMapping(value = "/topic", method = RequestMethod.POST)
    public void newTopic(TopicCommand command) {
        topicService.newTopic(command);
    }
    
    @RequestMapping(value = "/topic", method = RequestMethod.GET)
    public TopicResult topic(TopicParameter parameter) {
        return topicService.topic(parameter);
    }

}
