package com.example.trainerPayment.entity.mapping;

import java.util.ArrayList;
import java.util.List;

import com.example.trainerPayment.dto.PaymentData;
import com.example.trainerPayment.entity.Payment;

public class PaymentEntityMapper {
	public static PaymentData mapPaymentToPaymentData(Payment payment) {
		PaymentData paymentDto = new PaymentData();
		paymentDto.setAmount(payment.getAmount());
		paymentDto.setDateOfPayment(payment.getDateOfPayment());
		paymentDto.setId(payment.getId());
		paymentDto.setInvoiceNo(payment.getInvoiceNo());
		paymentDto.setTrainingSchedule(payment.getTrainingSchedule());
		return paymentDto;
	}
	
	public static List<PaymentData> mapPaymentListToPaymentDtoList(List<Payment> paymentList){
		List<PaymentData> paymentDataList = new ArrayList<PaymentData>();
		if(paymentList != null) {
			for (Payment payment : paymentList)
				paymentDataList.add(mapPaymentToPaymentData(payment));
		}
		
		return paymentDataList;
	}

}
