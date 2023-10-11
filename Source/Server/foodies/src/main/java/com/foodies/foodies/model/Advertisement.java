package com.foodies.foodies.model;


import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "advertisement")
public class Advertisement{
    @Id
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String advertisementId;
    private String imageUrl;
    private String description;
    private LocalDate publishedAt;
    private String visitLink;



    public String getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(String advertisementId) {
        this.advertisementId = advertisementId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt (LocalDate publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getVisitLink() {
        return visitLink;
    }

    public void setVisitLink (String visitLink) {
        this.visitLink = visitLink;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
