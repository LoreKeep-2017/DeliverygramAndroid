package com.example.ilia.deliverygramandroid.bean;

import java.util.Date;
import java.util.Objects;

/**
 * Created by ilia on 25.09.17.
 */

public class ChatMessage {

    private String user;
    private String message;
    private Date date;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public boolean equals(Object obj) {
        ChatMessage other = (ChatMessage) obj;
        return this.date.equals(other.date)&&
                this.message.equals(other.message)&&
                this.user.equals(other.user);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
