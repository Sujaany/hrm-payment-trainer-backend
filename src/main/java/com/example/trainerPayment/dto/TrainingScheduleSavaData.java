package com.example.trainerPayment.dto;

import java.util.Date;

import com.example.trainerPayment.enums.PaymentStatus;

public class TrainingScheduleSavaData {

	private Integer id;
	private String trainingTopic;
	private Date date;
	private Double totalCoveredhours;
	private PaymentStatus status;
	private Double amountToPaid;
	private Integer trainer;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTrainingTopic() {
		return trainingTopic;
	}
	public void setTrainingTopic(String trainingTopic) {
		this.trainingTopic = trainingTopic;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getTotalCoveredhours() {
		return totalCoveredhours;
	}
	public void setTotalCoveredhours(Double totalCoveredhours) {
		this.totalCoveredhours = totalCoveredhours;
	}
	public PaymentStatus getStatus() {
		return status;
	}
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	public Double getAmountToPaid() {
		return amountToPaid;
	}
	public void setAmounToPaid(Double amountToPaid) {
		this.amountToPaid = amountToPaid;
	}
	public Integer getTrainer() {
		return trainer;
	}
	public void setTrainer(Integer trainer) {
		this.trainer = trainer;
	}
	
}
