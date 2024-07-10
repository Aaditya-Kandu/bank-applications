package com.aaditya.banking.service.repository;

import com.aaditya.banking.service.model.request.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User , Integer> {
}
