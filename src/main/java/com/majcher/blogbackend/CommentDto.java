package com.majcher.blogbackend;

record CommentDto(
        int postId,
        int id,
        String name,
        String email,
        String body
) {
}
