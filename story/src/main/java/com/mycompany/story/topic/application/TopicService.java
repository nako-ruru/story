/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.story.topic.application;

import com.mycompany.story.topic.domain.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Administrator
 */
@Service
public class TopicService {

    @Resource
    private TitleRepository titleRepository;
    @Resource
    private ParticipantRepository participantRepository;
    @Resource
    private DialogRepository dialogRepository;

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

    public TopicResult topic(TopicParameter parameter) {
        Title title = titleRepository.findOne(parameter.getTopicId());
        List<Participant> participants = participantRepository.findByTopicId(parameter.getTopicId());
        List<String> participantIds = participants.stream()
                .map(Participant::getParticipantId)
                .collect(Collectors.toCollection(LinkedList::new));
        List<Dialog> dialogs = dialogRepository.findByParticipantIdIn(participantIds);

        List<TopicResult.RoleResult> roleResults = participants.stream()
                .map(p -> new TopicResult.RoleResult(p.getParticipantId(), p.getNickname(), p.getIcon()))
                .collect(Collectors.toCollection(LinkedList::new));
        List<TopicResult.DialogResult> dialogResults = dialogs.stream()
                .map(d -> new TopicResult.DialogResult(d.getParticipantId(), d.getContent(), d.getOrdinal()))
                .collect(Collectors.toCollection(LinkedList::new));
        return new TopicResult(title.getTitle(), roleResults, dialogResults);
    }

}
