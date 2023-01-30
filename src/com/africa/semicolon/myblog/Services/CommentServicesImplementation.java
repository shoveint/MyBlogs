package com.africa.semicolon.myblog.Services;

import com.africa.semicolon.myblog.Data.Comment;
import com.africa.semicolon.myblog.Data.Request.CreateCommentRequest;
import com.africa.semicolon.myblog.Repositories.CommentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServicesImplementation implements CommentServices {
    @Autowired
    private CommentRepositories commentRepositories;

    @Autowired
    private PostServices postServices;

    @Override
    public void createComment(CreateCommentRequest createCommentRequest){
        Comment comment = new Comment();
        comment.setComment(createCommentRequest.getComment());
        comment.setCommenterName(comment.getCommenterName());
        Comment savedComment = commentRepositories.save(comment);
        postServices.addComment(createCommentRequest.getPostId(), savedComment);
    }
    @Override
    public List<Comment> viewAllComment(){

        return commentRepositories.findAll();
    }
}
