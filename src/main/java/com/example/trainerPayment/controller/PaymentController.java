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

import com.example.trainerPayment.dto.PaymentSaveData;
import com.example.trainerPayment.dto.mapping.PaymentDataMapper;
import com.example.trainerPayment.entity.Payment;
import com.example.trainerPayment.service.PaymentService;
import com.example.trainerPayment.service.TrainingScheduleService;




@CrossOrigin(origins = "http://localhost:1222", maxAge = 3600)
@RestController
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	@Autowired 
	private TrainingScheduleService trainingScheduleService;
	@PostMapping("/payment")
	public HttpStatus addPaymentDetails(@RequestBody PaymentSaveData paymentSaveData) {
		if (paymentService.addPaymentDetails(PaymentDataMapper.mapPaymentSaveDataToPayment(paymentSaveData),trainingScheduleService.getTrainningScheduleById(paymentSaveData.getTrainingSchedule()))) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@PutMapping("/payment/{id}")
	public HttpStatus editPayment(@RequestBody PaymentSaveData paymentSaveData, @PathVariable Integer id) {
		if(paymentService.editPaymentDetails(PaymentDataMapper.mapPaymentSaveDataToPayment(paymentSaveData), trainingScheduleService.getTrainningScheduleById(paymentSaveData.getTrainingSchedule()), id)) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/payment")
	public ResponseEntity<List<Payment>> getPaymentDetails() {
		return new ResponseEntity<>(paymentService.getAllPaymentDetails(), HttpStatus.OK);

	}

	@GetMapping("/payment/{id}")
	public ResponseEntity<Payment> getPaymentByTrainingScheduleId(@PathVariable Integer id){
		return new ResponseEntity<Payment>(paymentService.getPaymentByTrainingScheduleId(id),HttpStatus.OK);
	}
}

