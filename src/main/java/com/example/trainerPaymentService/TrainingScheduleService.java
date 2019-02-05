package com.example.trainerPaymentService;

import java.util.List;

import com.example.trainerPaymentEntity.Trainer;
import com.example.trainerPaymentEntity.TrainingSchedule;

public interface TrainingScheduleService {

	boolean addTrainingSchedule(TrainingSchedule trainingSchedule, Trainer trainer);

	boolean updateTrainingSchedule(TrainingSchedule trainingSchedule,Trainer trainer, Integer id);

	List<TrainingSchedule> getAllTrainingSchedule();

	boolean paymentProcesses(TrainingSchedule trainingSchedule,Trainer trainer ,Integer id);

	boolean paymentCompleted(TrainingSchedule trainingSchedule,Trainer trainer, Integer id);
	
	TrainingSchedule getTrainningScheduleById(Integer id);
}
