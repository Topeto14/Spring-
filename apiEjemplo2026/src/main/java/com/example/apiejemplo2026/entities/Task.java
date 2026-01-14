package com.example.apiejemplo2026.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false,unique = true)
    private String title;
    private String descripcion;

    @Column(nullable = false, name = "finish_date")
    private LocalDate finishDate;

}
