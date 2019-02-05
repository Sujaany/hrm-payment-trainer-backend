package com.example.trainerPaymentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainerPaymentEntity.Status;

public interface StatusRepository extends JpaRepository<Status, Integer> {

}
