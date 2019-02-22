package com.example.trainerPayment.dto.mapping;


import com.example.trainerPayment.dto.TrainingScheduleSavaData;
import com.example.trainerPayment.entity.Trainer;
import com.example.trainerPayment.entity.TrainingSchedule;


public class TrainingScheduleDataMapper {

	public static TrainingSchedule mapTrainingScheduleSaveDataToTrainingSchedule(
			TrainingScheduleSavaData trainingScheduleSaveData) {
		TrainingSchedule trainingSchedule = new TrainingSchedule();
		Trainer trainer = new Trainer();
		trainingSchedule.setId(trainingScheduleSaveData.getId());
		trainingSchedule.setTrainingTopic(trainingScheduleSaveData.getTrainingTopic());
		trainingSchedule.setDate(trainingScheduleSaveData.getDate());
		trainingSchedule.setStatus(trainingScheduleSaveData.getStatus());
		trainingSchedule.setTotalCoveredhours(trainingScheduleSaveData.getTotalCoveredhours());
		trainingSchedule.setAmountToPaid(trainingScheduleSaveData.getAmountToPaid());
		trainer.setId(trainingScheduleSaveData.getTrainer());
		trainingSchedule.setTrainer(trainer);
		return trainingSchedule;
	}

}

