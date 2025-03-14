package com.example.socialweb.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long UserName;
    private Long password;
    private Long roles;

    
    
    public User() {
    }

    public User(Long id, Long userName, Long password, Long roles) {
        Id = id;
        UserName = userName;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getUserName() {
        return UserName;
    }

    public void setUserName(Long userName) {
        UserName = userName;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public Long getRoles() {
        return roles;
    }

    public void setRoles(Long roles) {
        this.roles = roles;
    }
    

    

    
    
}
