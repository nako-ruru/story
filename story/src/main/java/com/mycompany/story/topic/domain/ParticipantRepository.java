package com.mycompany.story.topic.domain;

import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
public interface ParticipantRepository {
    void save(Participant topic);
    Participant findOne(String participantId);
    List<Participant> findByTopicId(String topicId);
}
