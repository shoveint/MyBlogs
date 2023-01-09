package Services;

import Data.Request.CreateRequest;
import Data.Responses.CreateResponse;
import Model.Post;

import java.util.List;

public interface PostServices {
    void createPost(String tittle, String body);

    void createPost(CreateRequest CreateResponse);
    void updatedPost(int id, String tittle, String body);
    void deletePost(int id);
    void viewPost(int id);

    List<Post>viewAllPost();
}
