package com.foodies.foodies.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.foodies.foodies.model.Advertisement;
import com.foodies.foodies.service.AdvertisementService;

import java.util.List;

@RestController
@RequestMapping("/advertisement")
public class AdvertisementController{

    @Autowired
    private AdvertisementService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Advertisement createAdvertisement(@RequestBody Advertisement advertisement){
        return service.addAdvertisement(advertisement);
    }

    @GetMapping
    public List<Advertisement> getAdvertisements() {
        return service.findAllAdvertisements();
    }


    @GetMapping("/{advertisementId}")
    public Advertisement getAdvertisement(@PathVariable String advertisementId){
        return service.getAdvertisementByAdvertisementId(advertisementId);
    }

    

    @PutMapping
    public Advertisement modifyAdvertisement(@RequestBody Advertisement advertisement){
        return service.updateAdvertisement(advertisement);
    }

    @DeleteMapping("/{advertisementId}")
    public String deleteAdvertisement(@PathVariable String advertisementId){
        return service.deleteAdvertisement(advertisementId);
    }
}
