package com.ejemplo.forumhub.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(length = 5000)
    private String mensaje;

    private LocalDateTime fechaCreacion = LocalDateTime.now();

    private String status;

    private String autor;

    private String curso;
}

