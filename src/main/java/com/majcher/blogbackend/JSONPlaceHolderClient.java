package com.majcher.blogbackend;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
interface JSONPlaceHolderClient {
    @GetMapping(value = "/comments")
    List<CommentDto> getComments();
}
