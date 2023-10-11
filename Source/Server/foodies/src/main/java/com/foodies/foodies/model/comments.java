package com.foodies.foodies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class comments {
    @Id
    private String commentId;
    private String comment;
    private String commentedBy;
    private LocalDate commentedAt;
}
