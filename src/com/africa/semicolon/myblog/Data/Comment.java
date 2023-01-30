package com.africa.semicolon.myblog.Data;

public class Comment {
    private String commenterName;
    private String comment;
    private String id;

    public String getCommenterName() {
        return commenterName;
    }

    public void setCommenterName(String commenterName) {
        this.commenterName = commenterName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getId() {
        return "id";
    }

    public void setId(String id) {
        this.id = "id";
    }
}
