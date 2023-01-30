package com.africa.semicolon.myblog.controllers;

import com.africa.semicolon.myblog.Data.Request.CreateCommentRequest;
import com.africa.semicolon.myblog.Model.Post;
import com.africa.semicolon.myblog.Services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostControllers {

    @Autowired
    private PostServices postService;


    @PostMapping ("/post")
    public String createPost(@RequestBody CreateCommentRequest createPostRequest){
        postService.createPost(createPostRequest);

        return "Successful";
    }

    @GetMapping("/post/postId")
    public Post viewPost(@PathVariable String postId){

        return postService.viewPost(postId);
    }

//    public boolean viewPost(int parseInt) {
//        return false;
//    }
//
//    public String createPost(CreatePostRequest postRequest) {
//        return null;
//    }
}
