package com.example.trainerPaymentService;

import java.util.List;

import com.example.trainerPaymentEntity.Payment;
import com.example.trainerPaymentEntity.TrainingSchedule;
public interface PaymentService {

	boolean addPaymentDetails(Payment payment, TrainingSchedule trainingSchedule);
	boolean editPaymentDetails(Payment payment, TrainingSchedule trainingSchedule ,Integer id);
	List<Payment> getAllPaymentDetails();
	boolean deleatePaymentDetails(Integer id);
}
