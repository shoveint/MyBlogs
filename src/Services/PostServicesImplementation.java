package Services;

import Data.Request.CreateRequest;
import Model.Post;
import Repositories.PostRepo;
import Repositories.PostRepoImplementation;

import java.util.List;

public class PostServicesImplementation implements PostServices{
    private PostRepo postRepo = new PostRepoImplementation();
    @Override
    public void createPost(String tittle, String body) {
        Post post = new Post();
        post.setBody(body);
        post.setTitle(tittle);
        postRepo.save(post);

    }

    @Override
    public void createPost(CreateRequest CreateResponse) {

    }

    @Override
    public void updatedPost(int id, String tittle, String body) {

    }

    @Override
    public void deletePost(int id) {

    }

    @Override
    public void viewPost(int id) {

    }

    @Override
    public List<Post> viewAllPost() {
        return postRepo.findAll();
    }
}
