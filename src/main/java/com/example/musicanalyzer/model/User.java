package com.example.musicanalyzer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity  // Marks this class as a JPA entity to be managed by the EntityManager.
public class User {

    @Id  // Specifies the primary key property.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Specifies that the primary key value will be automatically generated.
    private Long id;

    @Column(unique = true, nullable = false)  // Configures the specifics of the column to which a field will be mapped, especially its uniqueness constraint.
    @NotBlank(message = "Username is mandatory")  // Ensures the field value is not blank.
    @Size(min = 3, max = 20, message = "Username should be between 3 and 20 characters")  // Specifies constraints on the size of the field value.
    private String username;

    @Column(nullable = false)
    @NotBlank(message = "Password is mandatory")
    @Size(min = 8, message = "Password should be at least 8 characters")  // Typically, you'd also use a stronger password constraint or a password encoder.
    private String password;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")  // Ensures the field value is a valid email address.
    private String email;

    // Default constructor required by JPA.
    public User() {
    }

    // Additional constructors, getters, setters, and other utility methods would go here.

    // ... omitted for brevity ...

}
