package com.africa.semicolon.myblog.Services;

import com.africa.semicolon.myblog.Data.Comment;
import com.africa.semicolon.myblog.Data.Request.CreateCommentRequest;
import com.africa.semicolon.myblog.Model.Post;
import com.africa.semicolon.myblog.controllers.CreatePostRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostServices {
    Post createPost(String tittle, String body);

    void createPost(CreateCommentRequest CreateResponse);
    void updatedPost(String id, String tittle, String body);

    void updatedPost(CreatePostRequest createPostRequest);

    void deletePost(String id);

    Post viewPost(String id);

    List<Post>viewAllPost();

    void addComment(String postId, Comment savedComment);
}
