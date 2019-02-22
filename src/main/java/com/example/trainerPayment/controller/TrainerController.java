package com.example.trainerPayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trainerPayment.entity.Trainer;
import com.example.trainerPayment.service.TrainerService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class TrainerController {

	@Autowired
	private TrainerService trainerService;

	@PostMapping("/trainer")
	public HttpStatus addTrainer(@RequestBody Trainer trainer) {
		if (trainerService.addTrainer(trainer)) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/trainer")
	public ResponseEntity<List<Trainer>> getAllTrainer() {
		return new ResponseEntity<>(trainerService.getAllTrainers(),HttpStatus.OK);
	}
	@GetMapping("/trainer/{id}")
	public ResponseEntity<Trainer>getTrainerByID(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(trainerService.getTrainerById(id),HttpStatus.OK);
	}
}

