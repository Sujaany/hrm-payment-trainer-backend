package com.example.trainerPaymentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainerPaymentEntity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
