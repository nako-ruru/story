package com.mycompany.story.topic.adapter.persistence.springdata;

import com.mycompany.story.topic.domain.Participant;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
@Component
public class JpaParticipantRepository implements com.mycompany.story.topic.domain.ParticipantRepository {

    @Resource
    private ParticipantRepository participantRepository;

    @Override
    public void save(Participant topic) {
        participantRepository.save(topic);
    }

    @Override
    public Participant findOne(String participantId) {
        return participantRepository.findOne(participantId);
    }

    @Override
    public List<Participant> findByTopicId(String topicId) {
        return participantRepository.findByTopicId(topicId);
    }


}
