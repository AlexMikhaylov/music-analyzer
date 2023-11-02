package com.example.musicanalyzer.models;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity //JPA entity class
@Table(name = "users") //table name in db
@Getter @Setter
public class User implements Serializable {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generating strategy
    private Long id;

    @Column(unique = true, nullable = false) //db column config
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    // Weitere Felder und Methoden können später hinzugefügt werden, je nach Bedarf

}
