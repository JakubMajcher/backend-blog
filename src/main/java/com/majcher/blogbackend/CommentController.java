package com.majcher.blogbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("v1")
class CommentController {

    @GetMapping(path = "/comments", produces = "application/json")
    @ResponseBody List getEmptyComments() {
        return Collections.emptyList();
    }
}
