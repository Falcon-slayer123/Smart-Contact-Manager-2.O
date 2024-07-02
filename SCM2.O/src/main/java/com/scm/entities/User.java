package com.scm.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "User")
@Table(name = "User")
public class User {

    @Id
    private String userId;
    @Column(name = "User_Name",nullable = false)
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    private String password;
    @Lob
    private String about;
    @Lob
    private String profilePic;
    private String phoneNumber;
    private boolean enabled=false;
    private boolean emailVerified=false;
    private boolean phoneVerified=false;

    //Signup Provider//
    private Providers provider=Providers.Self;
    private String providerUserId;
}
