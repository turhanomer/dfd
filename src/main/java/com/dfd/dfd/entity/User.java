package com.dfd.dfd.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity{
    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "username",nullable = false,unique = true)
    private String username;

    @Column(name = "mail",nullable = false,unique = true)
    private String mail;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "tc",unique = true)
    private Long tc;

    @Column(name = "title")
    private String title;

    @Column(name = "l_class")
    private Integer lClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_group_id")
    private UserGroup userGroup;

}
