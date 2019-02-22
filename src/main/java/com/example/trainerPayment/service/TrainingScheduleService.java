package com.example.trainerPayment.service;

import java.util.List;

import com.example.trainerPayment.entity.Trainer;
import com.example.trainerPayment.entity.TrainingSchedule;

public interface TrainingScheduleService {

	boolean addTrainingSchedule(TrainingSchedule trainingSchedule, Trainer trainer);

	boolean updateTrainingSchedule(TrainingSchedule trainingSchedule,Trainer trainer, Integer id);

	List<TrainingSchedule> getAllTrainingSchedule();

	boolean paymentProcesses(TrainingSchedule trainingSchedule,Trainer trainer ,Integer id);

	boolean paymentCompleted(TrainingSchedule trainingSchedule,Trainer trainer, Integer id);
	
	TrainingSchedule getTrainningScheduleById(Integer id);
}
