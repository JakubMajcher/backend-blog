package com.majcher.blogbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1")
class CommentController {

    private final CommentFacade commentFacade;

    CommentController(CommentFacade commentFacade) {
        this.commentFacade = commentFacade;
    }

    @GetMapping(path = "/posts/{postId}/comments", produces = "application/json")
    @ResponseBody
    List<Comment> getComments(
            @PathVariable(value = "postId") Long postId,
            @RequestParam(value = "id", required = false) Long commentId
    ) {
        return commentFacade.getComments(postId, commentId);
    }
}
