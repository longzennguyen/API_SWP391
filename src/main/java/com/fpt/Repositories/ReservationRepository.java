package com.fpt.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpt.model.ReservationModel;

public interface ReservationRepository extends JpaRepository<ReservationModel, Long> {

}
