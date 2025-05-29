package com.example.userdataAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userdataAPI.entity.Userentity;

public interface UserRepository extends JpaRepository<Userentity,Long>{

}
