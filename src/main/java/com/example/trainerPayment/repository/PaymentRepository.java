package com.example.trainerPayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainerPayment.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	Payment findByTrainingScheduleId(Integer id);

}
