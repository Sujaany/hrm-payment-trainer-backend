package com.example.trainerPaymentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainerPaymentEntity.TrainingSchedule;

public interface TrainingScheduleRepository extends JpaRepository<TrainingSchedule, Integer>{
	TrainingSchedule findTrainingScheduleById(Integer id);
	}


