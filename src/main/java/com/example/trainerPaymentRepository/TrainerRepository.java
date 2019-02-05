package com.example.trainerPaymentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainerPaymentEntity.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
	 Trainer findTrainerById(Integer id);
	}


