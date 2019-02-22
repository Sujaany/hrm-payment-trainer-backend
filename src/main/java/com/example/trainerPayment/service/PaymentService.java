package com.example.trainerPayment.service;

import java.util.List;

import com.example.trainerPayment.entity.Payment;
import com.example.trainerPayment.entity.TrainingSchedule;
public interface PaymentService {

	boolean addPaymentDetails(Payment payment, TrainingSchedule trainingSchedule);
	boolean editPaymentDetails(Payment payment, TrainingSchedule trainingSchedule ,Integer id);
	List<Payment> getAllPaymentDetails();
	boolean deletePaymentDetails(Integer id);
	Payment getPaymentByTrainingScheduleId(Integer id);
}
