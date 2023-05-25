package com.example.usermanagement.domain.models;

import com.example.sharedkernel.domain.base.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "user")
public class User extends AbstractEntity<UserId>{

    private UserId userId;

    private String userFullName;

    private String userEmail;

    private String username;

    private String password;

    private Instant creationDate;
}
