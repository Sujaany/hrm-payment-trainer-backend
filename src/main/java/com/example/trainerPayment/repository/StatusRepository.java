package com.example.trainerPayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainerPayment.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Integer> {

}
