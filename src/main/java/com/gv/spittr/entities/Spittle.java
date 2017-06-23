package com.gv.spittr.entities;

import java.util.Date;

public class Spittle {

    private long spittleId;

    private String content;

    private long authorsId;

    private Date date;

    public Spittle(long spittleId, String content, long authorsId, Date date) {
        this.spittleId = spittleId;
        this.content = content;
        this.authorsId = authorsId;
        this.date = date;
    }

    public long getSpittleId() {
        return spittleId;
    }

    public void setSpittleId(long spittleId) {
        this.spittleId = spittleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getAuthorsId() {
        return authorsId;
    }

    public void setAuthorsId(long authorsId) {
        this.authorsId = authorsId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
