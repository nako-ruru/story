package com.mycompany.story.topic.domain;

import com.mycompany.story.framework.spring.SpringContext;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/5/14.
 */
@Entity
public class Dialog implements Serializable {

    @Id
    private String dialogId;
    private String participantId;
    private String content;
    private int ordinal;
    
    private Dialog() {
    }

    public Dialog(String dialogId, String participantId, String content, int ordinal) {
        this.dialogId = dialogId;
        this.participantId = participantId;
        this.content = content;
        this.ordinal = ordinal;
    }

    public String getDialogId() {
        return dialogId;
    }

    public String getParticipantId() {
        return participantId;
    }

    public String getContent() {
        return content;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void save() {
        SpringContext.getBean(DialogRepository.class).doSave(this);
    }

}
