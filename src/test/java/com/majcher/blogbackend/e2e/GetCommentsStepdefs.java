package com.majcher.blogbackend.e2e;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@CucumberContextConfiguration
@SpringBootTest
public class GetCommentsStepdefs extends GetCommentsSamples {

    @Autowired
    LocalhostClient localhostClient;

    List<Comment> comments;

    @When("get all comments for post number {int}")
    public void getComments(long postId) {
        comments = localhostClient.getCommentsByPostIdAndCommentId(postId, null);
    }

    @Then("received {int} comment and it fits")
    public void receive_1_comment_and_it_fits(int size) {
        assertEquals(comments.size(), size);
        assertEquals(expectedComment, comments.get(0));
    }

    @When("get comment number {int} for post number {int}")
    public void getComments(long commentId, long postId) {
        comments = localhostClient.getCommentsByPostIdAndCommentId(postId, commentId);
    }

    @Then("received {int} comments and they fit")
    public void received_5_comments_and_they_fit(int size) {
        assertEquals(comments.size(), size);
        assertEquals(expectedComments, comments);
    }
}
