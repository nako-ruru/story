package com.mycompany.story.topic.adapter.persistence.springdata;

import com.mycompany.story.topic.domain.Dialog;
import com.mycompany.story.topic.domain.DialogRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/14.
 */
public interface JpaDialogRepository extends DialogRepository,  CrudRepository<Dialog, String> {

    @Override
    default void doSave(Dialog dialog) {
        save(dialog);
    }

    @Override
    List<Dialog> findByParticipantIdIn(List<String> participantIds);

}
