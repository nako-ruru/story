/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.story.topic.application;

import java.util.Collection;

/**
 *
 * @author Administrator
 */
public class TopicResult {

    private String title;
    private Collection<RoleResult> roles;
    private Collection<DialogResult> dialogs;

    public TopicResult(String title, Collection<RoleResult> roles, Collection<DialogResult> dialogs) {
        this.title = title;
        this.roles = roles;
        this.dialogs = dialogs;
    }

    public String getTitle() {
        return title;
    }

    public Collection<RoleResult> getRoles() {
        return roles;
    }

    public Collection<DialogResult> getDialogs() {
        return dialogs;
    }

    public static class RoleResult {

        private String speakerId, nickname, icon;

        public RoleResult(String speakerId, String nickname, String icon) {
            this.speakerId = speakerId;
            this.nickname = nickname;
            this.icon = icon;
        }

        public String getSpeakerId() {
            return speakerId;
        }

        public String getNickname() {
            return nickname;
        }

        public String getIcon() {
            return icon;
        }

    }

    public static class DialogResult {

        private String speakerId, dialog;
        private int ordinal;

        public DialogResult(String speakerId, String dialog, int ordinal) {
            this.speakerId = speakerId;
            this.dialog = dialog;
            this.ordinal = ordinal;
        }

        public String getSpeakerId() {
            return speakerId;
        }

        public String getDialog() {
            return dialog;
        }

        public int getOrdinal() {
            return ordinal;
        }

    }

}
