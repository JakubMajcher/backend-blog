package com.majcher.blogbackend.e2e;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "localhost", url = "http://localhost:8080/")
public interface LocalhostClient {
    @GetMapping(value = "v1/posts/{postId}/comments")
    List<Comment> getCommentsByPostIdAndCommentId(
            @PathVariable(value = "postId") Long postId,
            @RequestParam(value = "id", required = false) Long id
    );
}
