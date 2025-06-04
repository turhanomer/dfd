package com.dfd.dfd.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass // Veritabanında ayrı bir tablo oluşturlamaz, ama kendinden türeyen sınıflara miras bırakabilir
@Getter
@Setter
public class BaseEntity {
    @Id //birincil anahtar
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // id değeri db tarafından birer artıtır
    private Long id;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    private Boolean isActive = true;

    @PrePersist //ilk kez veri tabanına kaydetmeden önce çalışır
    protected void onCreate(){
        createdDate = LocalDateTime.now();
    }
    @PreUpdate //her güncellemede bu metod çalışır
    protected void onUpdate(){
        updatedDate = LocalDateTime.now();
    }
}
