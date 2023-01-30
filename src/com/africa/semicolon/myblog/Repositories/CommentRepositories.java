package com.africa.semicolon.myblog.Repositories;

import com.africa.semicolon.myblog.Data.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepositories extends MongoRepository<Comment, String> {
    Comment save(Comment comment);
}
