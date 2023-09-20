package com.majcher.blogbackend;

import java.util.List;

public class CommentFacade {

    private final JSONPlaceHolderClient jsonPlaceHolderClient;

    public CommentFacade(JSONPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    public List<Comment> getComments() {
        return jsonPlaceHolderClient
                .getComments()
                .stream()
                .map(Comment::fromDto)
                .toList();
    }
}
