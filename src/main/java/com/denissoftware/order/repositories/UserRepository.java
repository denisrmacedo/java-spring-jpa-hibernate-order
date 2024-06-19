package com.denissoftware.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denissoftware.order.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
