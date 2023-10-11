package com.foodies.foodies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodies.foodies.model.Advertisement;


@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement,String> {
}