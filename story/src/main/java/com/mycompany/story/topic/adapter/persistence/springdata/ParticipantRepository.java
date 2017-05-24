package com.mycompany.story.topic.adapter.persistence.springdata;

import com.mycompany.story.topic.domain.Participant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
public interface ParticipantRepository extends CrudRepository<Participant, String> {
    List<Participant> findByTopicId(String topicId);
}
