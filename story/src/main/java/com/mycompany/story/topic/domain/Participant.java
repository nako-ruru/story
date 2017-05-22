package com.mycompany.story.topic.domain;

import com.mycompany.story.framework.spring.SpringContext;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/5/14.
 */
@Entity
public class Participant {

    @Id
    private String participantId;
    private String icon;
    private String nickname;
    private String topicId;

    private Participant() {
    }

    public Participant(String participantId, String icon, String nickname, String topicId) {
        this.participantId = participantId;
        this.icon = icon;
        this.nickname = nickname;
        this.topicId = topicId;
    }

    public String getParticipantId() {
        return participantId;
    }

    public String getIcon() {
        return icon;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTopicId() {
        return topicId;
    }

    public void save() {
        SpringContext.getBean(ParticipantRepository.class).save(this);
    }

}
