package com.mycompany.story.topic.domain;

import com.mycompany.story.framework.spring.SpringContext;

import java.util.UUID;

/**
 * Created by Administrator on 2017/5/13.
 */
public class Topic {

    private String title;
    private String[] speakerIds;
    private String[] nicknames;
    private String[] icons;

    private String[] sentenceSpeakerIds;
    private String[] sentences;

    public Topic(String title, String[] speakerIds, String[] nicknames, String[] icons, String[] sentenceSpeakerIds, String[] sentences) {
        this.title = title;
        this.speakerIds = speakerIds;
        this.nicknames = nicknames;
        this.icons = icons;
        this.sentenceSpeakerIds = sentenceSpeakerIds;
        this.sentences = sentences;
    }

    public void save() {
        String topicId = UUID.randomUUID().toString();
        Title title = new Title(topicId, this.title);
        SpringContext.getBean(TitleRepository.class).save(title);

        int participantCount = speakerIds.length;
        for(int i = 0; i < participantCount; i++) {
            Participant participant = new Participant(speakerIds[i], icons[i], nicknames[i], topicId);
            SpringContext.getBean(ParticipantRepository.class).save(participant);
        }

        int sentenceCount = sentenceSpeakerIds.length;
        for(int i = 0; i < sentenceCount; i++) {
            Dialog dialog = new Dialog(UUID.randomUUID().toString(), sentenceSpeakerIds[i], sentences[i], i);
            SpringContext.getBean(DialogRepository.class).doSave(dialog);
        }
    }

}
