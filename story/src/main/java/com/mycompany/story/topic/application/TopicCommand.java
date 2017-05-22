/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.story.topic.application;

/**
 *
 * @author Administrator
 */
public class TopicCommand {

    private String title;
    private String[] speakerIds;
    private String[] nicknames;
    private String[] icons;

    private String[] sentenceSpeakerIds;
    private String[] sentences;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getSpeakerIds() {
        return speakerIds;
    }

    public void setSpeakerIds(String[] speakerIds) {
        this.speakerIds = speakerIds;
    }

    public String[] getNicknames() {
        return nicknames;
    }

    public void setNicknames(String[] nicknames) {
        this.nicknames = nicknames;
    }

    public String[] getIcons() {
        return icons;
    }

    public void setIcons(String[] icons) {
        this.icons = icons;
    }

    public String[] getSentenceSpeakerIds() {
        return sentenceSpeakerIds;
    }

    public void setSentenceSpeakerIds(String[] sentenceSpeakerIds) {
        this.sentenceSpeakerIds = sentenceSpeakerIds;
    }

    public String[] getSentences() {
        return sentences;
    }

    public void setSentences(String[] sentences) {
        this.sentences = sentences;
    }
}
