package com.foodies.foodies.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "like")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class like {
    @Id 
    private String likeId;
    private String postId;
    private String likedBy;
    private LocalDate postedAt;
}
