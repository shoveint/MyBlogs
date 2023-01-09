package Services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostServicesImplementationTest {
    private PostServices postServices;

    @BeforeEach
    public void setUp() {
        postServices = new PostServicesImplementation();
    }
    @Test
    public void createPostTest(){

        postServices.createPost("New Post", "My cohort is God's chosen");
        assertEquals(1, postServices.viewAllPost().size());
    }
}