package com.fpt.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpt.model.BlogModel;

public interface BlogRepository extends JpaRepository<BlogModel, Long>{

}
