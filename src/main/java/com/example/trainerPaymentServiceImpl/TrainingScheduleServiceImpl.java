package com.example.trainerPaymentServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trainerPayment.enums.PaymentStatus;
import com.example.trainerPaymentEntity.Trainer;
import com.example.trainerPaymentEntity.TrainingSchedule;
import com.example.trainerPaymentRepository.TrainingScheduleRepository;
import com.example.trainerPaymentService.TrainingScheduleService;

@Service
public class TrainingScheduleServiceImpl implements TrainingScheduleService {
	
	@Autowired
	private TrainingScheduleRepository trainingScheduleRepository;

	@Override
	public boolean addTrainingSchedule(TrainingSchedule trainingSchedule, Trainer trainer) {
		trainingSchedule.setStatus(PaymentStatus.INITIATED);
		trainingSchedule.setTrainer(trainer);
		trainingScheduleRepository.save(trainingSchedule);
		return true;
	}

	@Override
	public boolean updateTrainingSchedule(TrainingSchedule trainingSchedule, Trainer trainer , Integer id) {
		
		if(trainingScheduleRepository.getOne(id)!=null) {
			trainingSchedule.setTrainer(trainer);
			trainingSchedule.setId(id);
			trainingScheduleRepository.save(trainingSchedule);
			return true;
		}
		return false;
	}

	@Override
	public List<TrainingSchedule> getAllTrainingSchedule() {
		
		return trainingScheduleRepository.findAll();
	}

	@Override
	public boolean paymentProcesses(TrainingSchedule trainingSchedule, Trainer trainer, Integer id) {
		if(trainingScheduleRepository.getOne(id) != null) {
			trainingSchedule.setId(id);
			trainingSchedule.setStatus(PaymentStatus.PROCESSED);
			trainingSchedule.setTrainer(trainer);
			trainingScheduleRepository.save(trainingSchedule);
			return true;
		}
		return false;
	}

	@Override
	public boolean paymentCompleted(TrainingSchedule trainingSchedule ,Trainer trainer, Integer id) {
		if(trainingScheduleRepository.getOne(id) != null) {
			trainingSchedule.setId(id);
			trainingSchedule.setStatus(PaymentStatus.COMPLETED);
			trainingSchedule.setTrainer(trainer);
			trainingScheduleRepository.save(trainingSchedule);
			return true;
		}
		return false;
	}

	@Override
	public TrainingSchedule getTrainningScheduleById(Integer id) {
		return trainingScheduleRepository.findTrainingScheduleById(id);
	}

}