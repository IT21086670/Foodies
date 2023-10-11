package com.foodies.foodies.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodies.foodies.model.comments;
import com.foodies.foodies.repository.commentsRepository;

import java.util.List;
import java.util.UUID;

@Service
public class commentsService {

    @Autowired
    private commentsRepository repository;

    //CRUD  CREATE , READ , UPDATE , DELETE


    public comments addComment(comments Comment) {
        Comment.setCommentId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(Comment);
    }

    public List<comments> findAllComments() {
        return repository.findAll();
    }

    public comments getCommentByCommentId(String CommentId){
        return repository.findById(CommentId).get();
    }


    public comments updateComment(comments CommentRequest){
        //get the existing document from DB
        // populate new value from request to existing object/entity/document
        comments existingComment = repository.findById(CommentRequest.getCommentId()).get();
        existingComment.setComment(CommentRequest.getComment());
       
        return repository.save(existingComment);
    }

    public String deleteComment(String CommentId){
        repository.deleteById(CommentId);
        return CommentId+" Comment deleted from dashboard ";
    }
}