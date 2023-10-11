package com.foodies.foodies.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.foodies.foodies.model.notification;


public interface notificationRepository extends JpaRepository<notification, String> {

}
