package com.majcher.blogbackend;

import java.util.List;

public class CommentFacade {

    private final JSONPlaceHolderClient jsonPlaceHolderClient;

    public CommentFacade(JSONPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    public List<Comment> getComments(Long postId, Long commentId) {
        return jsonPlaceHolderClient
                .getCommentsByPostIdAndCommentId(postId, commentId)
                .stream()
                .map(Comment::fromDto)
                .toList();
    }
}
