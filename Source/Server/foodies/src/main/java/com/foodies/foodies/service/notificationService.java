package com.foodies.foodies.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodies.foodies.model.notification;
import com.foodies.foodies.repository.notificationRepository;

import java.util.List;
import java.util.UUID;

@Service
public class notificationService {

    @Autowired
    private notificationRepository repository;

    //CRUD  CREATE , READ , UPDATE , DELETE


    public notification addNotification(notification Notification) {
        Notification.setNotificationId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(Notification);
    }

    public List<notification> findAllNotifications() {
        return repository.findAll();
    }

    public notification getNotificationByNotificationId(String NotificationId){
        return repository.findById(NotificationId).get();
    }

    
    public notification updateNotification(notification notification){
        //get the existing document from DB
        // populate new value from request to existing object/entity/document
        notification existingComment = repository.findById(notification.getId()).get();
        existingComment.setMessage(notification.getMessage());
       
        return repository.save(existingComment);
    }

    public String deleteNotification(String NotificationId){
        repository.deleteById(NotificationId);
        return NotificationId+" Notification deleted from dashboard ";
    }
}









