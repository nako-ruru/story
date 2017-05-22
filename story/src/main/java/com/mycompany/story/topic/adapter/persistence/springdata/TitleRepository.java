package com.mycompany.story.topic.adapter.persistence.springdata;

import com.mycompany.story.topic.domain.Title;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2017/5/13.
 */
public interface TitleRepository extends CrudRepository<Title, String> {
}
