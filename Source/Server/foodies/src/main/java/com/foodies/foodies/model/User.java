package com.foodies.foodies.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class User {
    @Id
    private String userId;
    private String name;
    private String imageUrl;
    private LocalDate createdDate;
    private String address;

    public String getUserId() {
        return this.userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String ids) {
        this.imageUrl = ids;
    }

    public void setCreatedDate(LocalDate ids) {
        this.createdDate = ids;
    }

    public void setAddress(String ids) {
        this.address = ids;
    }

    public void setUserId(String ids) {
        this.userId = ids;
    }

    public String getName() {
        return this.name;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public LocalDate getCreatedAt() {
        return this.createdDate;
    }

    public String getAddress() {
        return this.address;
    }
}
