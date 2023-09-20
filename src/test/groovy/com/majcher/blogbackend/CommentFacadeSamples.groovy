package com.majcher.blogbackend

trait CommentFacadeSamples {

    CommentDto commentDto = new CommentDto(1, 1, "name", "email", "body")
    List<CommentDto> emptyList = List.of()
    List<CommentDto> oneCommentList = List.of(commentDto)
    List<CommentDto> thereCommentsList = List.of(commentDto, commentDto, commentDto)
}
