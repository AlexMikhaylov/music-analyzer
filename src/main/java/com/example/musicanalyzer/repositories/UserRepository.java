package com.example.musicanalyzer.repositories;

import com.example.musicanalyzer.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // placeholder for specific db queries
}