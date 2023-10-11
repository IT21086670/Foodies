package com.foodies.foodies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.foodies.foodies.model.notification;
import com.foodies.foodies.service.notificationService;

import java.util.List;

@RestController
@RequestMapping("/Notifications")
public class notificationController {

    @Autowired
    private notificationService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public notification createNotification(@RequestBody notification Notification){
        return service.addNotification(Notification);
    }

    @GetMapping
    public List<notification> getNotifications() {
        return service.findAllNotifications();
    }


    @GetMapping("/{NotificationId}")
    public notification getNotification(@PathVariable String NotificationId){
        return service.getNotificationByNotificationId(NotificationId);
    }

    

    @PutMapping
    public notification modifyNotification(@RequestBody notification Notification){
        return service.updateNotification(Notification);
    }

    @DeleteMapping("/{NotificationId}")
    public String deleteNotification(@PathVariable String NotificationId){
        return service.deleteNotification(NotificationId);
    }
}
