package com.example.trainerPayment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trainerPayment.entity.Trainer;
import com.example.trainerPayment.repository.TrainerRepository;
import com.example.trainerPayment.service.TrainerService;

@Service
public class TrainerServiceImpl implements TrainerService{
	@Autowired
	private TrainerRepository trainerRepository;

	@Override
	public boolean addTrainer(Trainer trainer) {
		trainerRepository.save(trainer);
		return true;
	}

	@Override
	public boolean editTrainer(Trainer trainer, Integer id) {
		if(trainerRepository.getOne(id)!=null) {
			trainerRepository.save(trainer);
			return true;
		}
		return false;
	}

	@Override
	public List<Trainer> getAllTrainers() {
		return trainerRepository.findAll();
	}

	@Override
	public boolean deleteTrainer(Integer id) {
		if(trainerRepository.getOne(id)!=null) {
			trainerRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public Trainer getTrainerById(Integer id) {
		return trainerRepository.findTrainerById(id);
	}

}
