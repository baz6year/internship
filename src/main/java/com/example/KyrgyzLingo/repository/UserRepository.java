package com.example.KyrgyzLingo.repository;

import com.example.KyrgyzLingo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void deleteById(Long id);
}
