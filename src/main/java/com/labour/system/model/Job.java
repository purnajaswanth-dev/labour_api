package com.labour.system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    private String location;

    private Double salary;

    private String employerName;

    private String jobType;

    private LocalDateTime postedAt;

    private Boolean isActive = true;

    @PrePersist
    protected void onCreate() {
        this.postedAt = LocalDateTime.now();
    }
}
