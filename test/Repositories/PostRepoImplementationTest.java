package Repositories;

import com.africa.semicolon.myblog.Model.Post;
import com.africa.semicolon.myblog.Repositories.PostRepo;
import com.africa.semicolon.myblog.Repositories.PostRepoImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PostRepoImplementationTest {
    PostRepo postRepo;

    @BeforeEach
    void setUp() {
        postRepo = new PostRepoImplementation();

    }
    @Test
    public  void saveNewPost_countShouldBeOne_test(){
        Post post = new Post();
        post.setBody("our post body");
        post.setTitle("Our post title");
        postRepo.save(post);
        assertEquals(1L, postRepo.count());
    }
    @Test
    public  void saveNewPost_findById_shouldReturnSavePostTest() {
        Post post = new Post();
        post.setBody("our post body");
        post.setTitle("Our post title");
        postRepo.save(post);
        assertEquals(1L, postRepo.count());
        Post savedPost = postRepo.findById(1);
        assertEquals(post, savedPost);
        Post post2 = new Post();
        postRepo.save(post2);
        assertEquals(post2, postRepo.findById(2));

    }
    @Test
    public void saveNewPost_updatePost_countIsOneTest(){
        Post post = new Post();
        post.setTitle("Our post title");
        post.setBody("Our post body");
        postRepo.save(post);

        Post updatedPost = new Post();
        updatedPost.setId(1);
        updatedPost.setBody("Updated body");
        updatedPost.setTitle("Updated tittle");
        postRepo.save(updatedPost);
        assertEquals(1L, postRepo.count());
        assertEquals(post, postRepo.findById(1));
        assertEquals("Updated body", post.getBody());
        assertEquals("Updated tittle", post.getTitle());
    }
    @Test
    public void deletePostTest() {
        Post post = new Post();
        post.setTitle("Our post title");
        post.setBody("Our post body");
        postRepo.save(post);
        assertEquals(1L, postRepo.count());
        postRepo.delete(1);
        assertEquals(0L, postRepo.count());
        assertNull(postRepo.findById(1));
    }

}