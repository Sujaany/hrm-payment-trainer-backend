package com.example.trainerPayment.entity.mapping;

import java.util.ArrayList;
import java.util.List;

import com.example.trainerPayment.dto.TrainingScheduleData;
import com.example.trainerPayment.entity.TrainingSchedule;

public class TrainingScheduleEntityMapper {
	public static TrainingScheduleData mapTraininScheduleToTrainingScheduleDto(TrainingSchedule trainingSchedule) {
		TrainingScheduleData trainingScheduleDto = new TrainingScheduleData();
		trainingScheduleDto.setAmountToPaid(trainingSchedule.getAmountToPaid());
		trainingScheduleDto.setDate(trainingSchedule.getDate());
		trainingScheduleDto.setId(trainingSchedule.getId());
		trainingScheduleDto.setTotalCoveredhours(trainingSchedule.getTotalCoveredhours());
		trainingScheduleDto.setTrainingTopic(trainingSchedule.getTrainingTopic());
		trainingScheduleDto.setTrainer(trainingSchedule.getTrainer());
		trainingScheduleDto.setStatus(trainingSchedule.getStatus());
		return trainingScheduleDto;
	}

	public static List<TrainingScheduleData> mapTrainingScheduleListToPaymentInitiationDtoList(
			List<TrainingSchedule> trainingScheduleList) {
		List<TrainingScheduleData> paymentInitiationDataList = new ArrayList<TrainingScheduleData>();
		if (trainingScheduleList != null) {
			for (TrainingSchedule trainingSchedule : trainingScheduleList)
				paymentInitiationDataList.add(mapTraininScheduleToTrainingScheduleDto(trainingSchedule));

		}
		return paymentInitiationDataList;
	}
}
