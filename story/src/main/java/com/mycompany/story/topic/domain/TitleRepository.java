package com.mycompany.story.topic.domain;

/**
 * Created by Administrator on 2017/5/13.
 */
public interface TitleRepository {
    void save(Title topic);
    Title findOne(String topicId);
}
