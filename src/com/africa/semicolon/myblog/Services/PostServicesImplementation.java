package com.africa.semicolon.myblog.Services;

import com.africa.semicolon.myblog.Data.Comment;
import com.africa.semicolon.myblog.Data.Request.CreateCommentRequest;
import com.africa.semicolon.myblog.Model.Post;
import com.africa.semicolon.myblog.Repositories.PostRepo;
import com.africa.semicolon.myblog.controllers.CreatePostRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostServicesImplementation implements PostServices{
    @Autowired
    private PostRepo postRepo;
    @Override
    public Post createPost(String tittle, String body) {
        Post post = new Post();
        post.setBody(body);
        post.setTitle(tittle);
        postRepo.save(post);
        return post;

    }

    @Override
    public void createPost(CreateCommentRequest CreateResponse) {

    }
    @Override
    public void updatedPost(CreatePostRequest createPostRequest) {

    }
    @Override
    public void deletePost(String id) {

    }

    @Override
    public Post viewPost(String id) { return postRepo.findPostById("id");
    }

    @Override
    public void updatedPost(String id, String tittle, String body) {

    }

    @Override
    public List<Post> viewAllPost() {
        return postRepo.findAll();
    }

    @Override
    public void addComment(String postId, Comment savedComment) {

    }
}
