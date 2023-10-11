package com.foodies.foodies.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.foodies.foodies.model.comments;
import com.foodies.foodies.service.commentsService;

import java.util.List;

@RestController
@RequestMapping("/Comments")
public class commentsController {

    @Autowired
    private commentsService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public comments createComment(@RequestBody comments Comment){
        return service.addComment(Comment);
    }

    @GetMapping
    public List<comments> getComments() {
        return service.findAllComments();
    }


    @GetMapping("/{CommentId}")
    public comments getComment(@PathVariable String CommentId){
        return service.getCommentByCommentId(CommentId);
    }

    

    @PutMapping
    public comments modifyComment(@RequestBody comments Comment){
        return service.updateComment(Comment);
    }

    @DeleteMapping("/{CommentId}")
    public String deleteComment(@PathVariable String CommentId){
        return service.deleteComment(CommentId);
    }
}
