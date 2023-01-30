package com.africa.semicolon.myblog.controllers;

import com.africa.semicolon.myblog.Data.Request.CreateCommentRequest;
import com.africa.semicolon.myblog.Services.CommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentControllers {
    @Autowired
    private CommentServices commentServices;

    @PostMapping("/comment")
    public String addComment(@RequestBody CreateCommentRequest createCommentRequest){
        commentServices.createComment(createCommentRequest);

        return "Comment added";
    }
}
