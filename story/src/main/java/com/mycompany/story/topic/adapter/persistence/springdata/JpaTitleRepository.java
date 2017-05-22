package com.mycompany.story.topic.adapter.persistence.springdata;

import com.mycompany.story.topic.domain.Title;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/13.
 */
@Component
public class JpaTitleRepository implements com.mycompany.story.topic.domain.TitleRepository {

    @Resource
    private TitleRepository titleRepository;

    @Override
    public void save(Title topic) {
        titleRepository.save(topic);
    }

    @Override
    public Title findOne(String topicId) {
        return titleRepository.findOne(topicId);
    }
}
