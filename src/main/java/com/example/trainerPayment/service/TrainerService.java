package com.example.trainerPayment.service;

import java.util.List;

import com.example.trainerPayment.entity.Trainer;

public interface TrainerService {

	boolean addTrainer(Trainer trainer);
	boolean editTrainer(Trainer trainer,Integer id);
	List<Trainer>getAllTrainers();
	boolean deleteTrainer(Integer id);
	Trainer getTrainerById(Integer id);
}
