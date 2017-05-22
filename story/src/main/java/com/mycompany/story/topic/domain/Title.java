package com.mycompany.story.topic.domain;

import com.mycompany.story.framework.spring.SpringContext;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/5/13.
 */
@Entity
public class Title {

    @Id
    private String topicId;
    private String title;

    public Title(){
    }

    public Title(String topicId, String title) {
        this.topicId = topicId;
        this.title = title;
    }

    public String getTopicId() {
        return topicId;
    }

    public String getTitle() {
        return title;
    }

    public void save() {
        SpringContext.getBean(TitleRepository.class).save(this);
    }

}
