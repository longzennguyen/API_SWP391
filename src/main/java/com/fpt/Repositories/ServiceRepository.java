package com.fpt.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpt.model.ServiceModel;

public interface ServiceRepository extends JpaRepository<ServiceModel, Long>{

}
