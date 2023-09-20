package com.majcher.blogbackend;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
interface JSONPlaceHolderClient {
    @GetMapping(value = "/posts/{postId}/comments")
    List<CommentDto> getCommentsByPostIdAndCommentId(
            @PathVariable(value = "postId") Long postId,
            @RequestParam(value = "id", required = false) Long id
    );
}
