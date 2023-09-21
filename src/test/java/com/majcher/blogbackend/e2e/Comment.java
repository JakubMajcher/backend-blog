package com.majcher.blogbackend.e2e;

record Comment(
        int postId,
        int id,
        String name,
        String email,
        String body
) {
}
