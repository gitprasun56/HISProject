package com.prasun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prasun.entity.AdminEntity;


public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {

}
