package com.foodies.foodies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notification")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class notification {
    @Id 
    private String id;
    private String notificationId;
    private String message;
    private String notificatedTo;
    private LocalDate notificatedAt;
}
