package com.fpt.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpt.model.PostModel;

public interface PostRepository extends JpaRepository<PostModel, Long>{

}
