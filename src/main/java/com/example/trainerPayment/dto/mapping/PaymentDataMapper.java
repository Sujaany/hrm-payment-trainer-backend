package com.example.trainerPayment.dto.mapping;

import com.example.trainerPayment.dto.PaymentSaveData;
import com.example.trainerPayment.entity.Payment;
import com.example.trainerPayment.entity.TrainingSchedule;

public class PaymentDataMapper {
	
	public static Payment mapPaymentSaveDataToPayment(PaymentSaveData paymentSaveData) {
		Payment payment = new Payment();
		TrainingSchedule trainingSchedule = new TrainingSchedule();
		payment.setId(paymentSaveData.getId());
		payment.setDateOfPayment(paymentSaveData.getDateOfPayment());
		payment.setAmount(paymentSaveData.getAmount());
		payment.setInvoiceNo(paymentSaveData.getInvoiceNo());
		trainingSchedule.setId(paymentSaveData.getTrainingSchedule());
		payment.setTrainingSchedule(trainingSchedule);
		return payment;
	}
}
