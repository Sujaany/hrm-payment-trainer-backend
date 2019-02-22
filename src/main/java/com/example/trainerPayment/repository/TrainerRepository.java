package com.example.trainerPayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainerPayment.entity.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
	 Trainer findTrainerById(Integer id);
	}


