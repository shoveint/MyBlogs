package com.africa.semicolon.myblog.Repositories;

import com.africa.semicolon.myblog.Model.Post;

import java.util.List;

public interface PostRepo {
    Post save(Post post);
    Post findById(String id);
    List<Post> findAll();
    long count();
    void delete(Post post);
    void  delete (int id);

    Post findPostById(String id);
}
