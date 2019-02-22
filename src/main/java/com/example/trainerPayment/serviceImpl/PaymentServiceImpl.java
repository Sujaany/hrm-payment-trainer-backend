package com.example.trainerPayment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trainerPayment.entity.Payment;
import com.example.trainerPayment.entity.TrainingSchedule;
import com.example.trainerPayment.enums.PaymentStatus;
import com.example.trainerPayment.repository.PaymentRepository;
import com.example.trainerPayment.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Override
	public boolean addPaymentDetails(Payment payment, TrainingSchedule trainingSchedule) {
		if (trainingSchedule != null) {
			trainingSchedule.setStatus(PaymentStatus.DEPOSITED);
			payment.setTrainingSchedule(trainingSchedule);
			paymentRepository.save(payment);
			return true;
		}
		return false;
	}

	@Override
	public boolean editPaymentDetails(Payment payment, TrainingSchedule trainingSchedule, Integer id) {
		if (paymentRepository.getOne(id) != null) {
			payment.setTrainingSchedule(trainingSchedule);
			paymentRepository.save(payment);
			return true;
		}
		return false;
	}

	@Override
	public List<Payment> getAllPaymentDetails() {
		return paymentRepository.findAll();
		}

	@Override
	public boolean deletePaymentDetails(Integer id) {
		if (paymentRepository.getOne(id) != null) {
			paymentRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public Payment getPaymentByTrainingScheduleId(Integer id) {
		return paymentRepository.findByTrainingScheduleId(id);
	}
}
