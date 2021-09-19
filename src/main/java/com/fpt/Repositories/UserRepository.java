package com.fpt.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpt.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{

}
