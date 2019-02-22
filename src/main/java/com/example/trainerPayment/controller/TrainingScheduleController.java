package com.example.trainerPayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trainerPayment.dto.TrainingScheduleSavaData;
import com.example.trainerPayment.dto.mapping.TrainingScheduleDataMapper;
import com.example.trainerPayment.entity.TrainingSchedule;
import com.example.trainerPayment.service.TrainerService;
import com.example.trainerPayment.service.TrainingScheduleService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class TrainingScheduleController {

	@Autowired
	private TrainingScheduleService trainingScheduleService;
	@Autowired
	private TrainerService trainerService;

	@PostMapping("/trainingschedule")
	public HttpStatus addPaymentInitiation(@RequestBody TrainingScheduleSavaData trainingScheduleSaveData) {
		if (trainingScheduleService.addTrainingSchedule(
				TrainingScheduleDataMapper.mapTrainingScheduleSaveDataToTrainingSchedule(trainingScheduleSaveData),
				trainerService.getTrainerById(trainingScheduleSaveData.getTrainer()))) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@PutMapping("/trainingschedule/{id}")
	public HttpStatus editPaymentInitiation(@RequestBody TrainingScheduleSavaData trainingScheduleSaveDto , @PathVariable Integer id) {
		if (trainingScheduleService.updateTrainingSchedule(
				TrainingScheduleDataMapper.mapTrainingScheduleSaveDataToTrainingSchedule(trainingScheduleSaveDto),
				trainerService.getTrainerById(trainingScheduleSaveDto.getTrainer()),id)) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	
	@GetMapping("/trainingschedule")
	public ResponseEntity<List<TrainingSchedule>> getTrainingSchedule() {
		return new ResponseEntity<>(trainingScheduleService.getAllTrainingSchedule(), HttpStatus.OK);

	}
	@GetMapping("/trainingschedule/{id}")
	public ResponseEntity<TrainingSchedule> getTrainingScheduleById(@PathVariable Integer id) {
		return new ResponseEntity<>(trainingScheduleService.getTrainningScheduleById(id), HttpStatus.OK);

	}

	@PutMapping("/trainingschedule/processed/{id}")
	public HttpStatus paymentProcess(@RequestBody TrainingScheduleSavaData trainingScheduleSaveDto,
			@PathVariable Integer id) {
		if (trainingScheduleService.paymentProcesses(
				TrainingScheduleDataMapper.mapTrainingScheduleSaveDataToTrainingSchedule(trainingScheduleSaveDto),
				trainerService.getTrainerById(trainingScheduleSaveDto.getTrainer()), id)) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@PutMapping("/trainingschedule/completed/{id}")
	public HttpStatus paymentCompleted(@RequestBody TrainingScheduleSavaData trainingScheduleSaveDto,
			@PathVariable Integer id) {
		if (trainingScheduleService.paymentCompleted(
				TrainingScheduleDataMapper.mapTrainingScheduleSaveDataToTrainingSchedule(trainingScheduleSaveDto),
				trainerService.getTrainerById(trainingScheduleSaveDto.getTrainer()), id)) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}

