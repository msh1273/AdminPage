package com.example.admin_study.repository;

import com.example.admin_study.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findFirstByPhoneNumberOrderByIdDesc(String phoneNumber);
}
