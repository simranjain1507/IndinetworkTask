package com.example.android.indinetworktask.Utils;

/**
 * Created by simranjain1507 on 13/09/17.
 */

public class Message {
    String sender, message, date;
    int imageID;

    public Message(String sender, String message, String date, int imageID) {
        this.sender = sender;
        this.message = message;
        this.date = date;
        this.imageID = imageID;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
