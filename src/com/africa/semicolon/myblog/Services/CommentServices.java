package com.africa.semicolon.myblog.Services;

import com.africa.semicolon.myblog.Data.Comment;
import com.africa.semicolon.myblog.Data.Request.CreateCommentRequest;

import java.util.List;

public interface CommentServices {
    void createComment(CreateCommentRequest createCommentRequest);
    List<Comment> viewAllComment();
}
