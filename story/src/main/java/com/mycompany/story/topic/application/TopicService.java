/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.story.topic.application;

import com.mycompany.story.topic.domain.Topic;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class TopicService {

    public void newTopic(TopicCommand command) {
        new Topic(
                command.getTitle(),
                command.getSpeakerIds(),
                command.getNicknames(),
                command.getIcons(),
                command.getSentenceSpeakerIds(),
                command.getSentences()
        ).save();
    }

}
