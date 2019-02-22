package com.example.trainerPayment.dto;

import java.util.Date;

import com.example.trainerPayment.entity.TrainingSchedule;

public class PaymentData {
	private Integer id;
	private Double amount;
	private Date dateOfPayment;
	private Integer invoiceNo;
	private TrainingSchedule trainingSchedule;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	public Integer getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(Integer invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public TrainingSchedule getTrainingSchedule() {
		return trainingSchedule;
	}
	public void setTrainingSchedule(TrainingSchedule trainingSchedule) {
		this.trainingSchedule = trainingSchedule;
	}
	
	

}
