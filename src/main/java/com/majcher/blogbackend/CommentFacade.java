package com.majcher.blogbackend;

import java.net.UnknownHostException;
import java.util.List;

public class CommentFacade {

    private final JSONPlaceHolderClient jsonPlaceHolderClient;

    public CommentFacade(JSONPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    public List<Comment> getComments(Long postId, Long commentId) {
        try {
            return jsonPlaceHolderClient
                    .getCommentsByPostIdAndCommentId(postId, commentId)
                    .stream()
                    .map(Comment::fromDto)
                    .toList();
        } catch (UnknownHostException e) {
            throw new ExternalSystemUnavailableException();
        }
    }
}
