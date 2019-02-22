package com.example.trainerPayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainerPayment.entity.TrainingSchedule;

public interface TrainingScheduleRepository extends JpaRepository<TrainingSchedule, Integer>{
	TrainingSchedule findTrainingScheduleById(Integer id);
	}


