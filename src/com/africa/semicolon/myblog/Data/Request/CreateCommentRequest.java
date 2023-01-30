package com.africa.semicolon.myblog.Data.Request;

import lombok.*;

@Data
public class CreateCommentRequest {
    private  String postId;
    private String commenterName;
    private String comment;
}
