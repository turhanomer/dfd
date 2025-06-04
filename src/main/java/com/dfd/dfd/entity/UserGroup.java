package com.dfd.dfd.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity//veritabanında bir tablo karşılığı olduğunu söyler
@Table(name = "user_group")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserGroup extends BaseEntity{
    @Column(name = "name",nullable = false, unique = true) // null olamaz ve tekil olmalı
    private String name;

}
