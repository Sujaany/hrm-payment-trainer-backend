package com.example.trainerPaymentService;

import java.util.List;

import com.example.trainerPaymentEntity.Status;

public interface StatusService {
	public List<Status> getAllStatus();
	boolean save(Status status);
	boolean delete(int id);
	boolean editStatus(Status status, Integer id);
	Status getStatusById(Integer id);
}
