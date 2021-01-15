package com.example.basic.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String account;
    private String email;
    private String phoneNumber;

    private LocalDateTime createdAt;
    private String createdBy;

    private LocalDateTime upatedAt;
    private String upatedBy;
}
