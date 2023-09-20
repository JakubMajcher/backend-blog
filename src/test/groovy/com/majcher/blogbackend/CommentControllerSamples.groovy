package com.majcher.blogbackend

trait CommentControllerSamples {

    List emptyList = List.of()
    List comments = List.of(new Comment(1, 1, "nameValue", "emailValue", "bodyValue"))
    String emptyJsonResponse = "[]"
    String nonEmptyJsonResponse = "[{\"postId\":1,\"id\":1,\"name\":\"nameValue\",\"email\":\"emailValue\",\"body\":\"bodyValue\"}]"
}
