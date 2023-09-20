package com.majcher.blogbackend;

record Comment(
        int postId,
        int id,
        String name,
        String email,
        String body
) {
    static Comment fromDto(CommentDto commentDto) {
        return new Comment(
                commentDto.postId(),
                commentDto.id(),
                commentDto.name(),
                commentDto.email(),
                commentDto.body()
        );
    }
}
