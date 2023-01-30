package com.africa.semicolon.myblog.Data.Request;

import lombok.Data;

@Data
public class CreatePostRequest {
    private String title;
    private String body;
    private String id;
}
