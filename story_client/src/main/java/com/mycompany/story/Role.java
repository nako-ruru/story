/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.story;

/**
 *
 * @author Administrator
 */
public class Role {
    
    private String speakerId;
    private String nickname;
    private String icon;
    
    public Role() {
    }
    
    public Role(String speakerId, String nickname, String icon) {
        this.speakerId = speakerId;
        this.nickname = nickname;
        this.icon = icon;
    }

    public String getSpeakerId() {
        return speakerId;
    }

    public void setSpeakerId(String speakerId) {
        this.speakerId = speakerId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
}
