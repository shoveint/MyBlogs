package Repositories;

import Model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepoImplementation implements PostRepo{
    private List<Post> postDb = new ArrayList<>();
    @Override
    public Post save(Post post) {
        if (post.getId()!=0)update(post);
        else {
            post.setId(postDb.size() + 1);
            postDb.add(post);
        }
        return post;
    }
    private void update(Post post){
        //find the original
        Post savePost = findById(post.getId());
        savePost.setTitle(post.getTitle());
        savePost.setBody(post.getBody());

        //set with new details

    }

    @Override
    public Post findById(int id) {
        for (Post post : postDb)
            if (post.getId()==id) return post;

        return null;
    }

    @Override
    public List<Post> findAll() {
        return null;
    }

    @Override
    public long count() {
        return postDb.size();
    }

    @Override
    public void delete(Post post) {

    }

    @Override
    public void delete(int id) {
        postDb.remove(id-1);
    }
}
