package com.newsletter.aaron.character;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Character {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    private String firstName;
    private String lastName;
    private String userName;
    private String classType;

    // private Long health;
    // private Long attack;
    // private Long defense;
    // private Long speed;
    // private Long charisma;

    @Column
    @CreationTimestamp
    private Date createdAt;

    public Character() {

    }

    public Character(String firstName, String lastName, String userName, String classType, Date createdAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.classType = classType;
        this.createdAt = createdAt;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Date getCreated() {
        return createdAt;
    }

    public void setCreated(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Character [Id=" + Id + ", classType=" + classType + ", createdAt=" + createdAt + ", firstName="
                + firstName + ", lastName=" + lastName + ", userName=" + userName + "]";
    }
    
}
