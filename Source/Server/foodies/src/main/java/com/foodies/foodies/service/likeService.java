package com.foodies.foodies.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodies.foodies.model.like;
import com.foodies.foodies.repository.likeRepository;

import java.util.List;
import java.util.UUID;

@Service
public class likeService {

    @Autowired
    private likeRepository repository;

    //CRUD  CREATE , READ , UPDATE , DELETE


    public like addLike(like Like) {
        Like.setLikeId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(Like);
    }

    public List<like> findAllLikes() {
        return repository.findAll();
    }

    public like getLikeByLikeId(String LikeId){
        return repository.findById(LikeId).get();
    }


    public String deleteLike(String LikeId){
        repository.deleteById(LikeId);
        return LikeId+" Like deleted from dashboard ";
    }
}
