package com.mycompany.story.topic.domain;

import java.util.List;

/**
 * Created by Administrator on 2017/5/14.
 */
public interface DialogRepository {

    void doSave(Dialog dialog);
    List<Dialog> findByParticipantIdIn(List<String> participantIds);

}
