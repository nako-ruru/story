package com.mycompany.story.topic.adapter.persistence.springdata;

import com.mycompany.story.topic.domain.Participant;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/13.
 */
@Component
public class JpaParticipantRepository implements com.mycompany.story.topic.domain.ParticipantRepository {

    @Resource
    private ParticipantRepository topicRepository;

    @Override
    public void save(Participant topic) {
        topicRepository.save(topic);
    }
}
