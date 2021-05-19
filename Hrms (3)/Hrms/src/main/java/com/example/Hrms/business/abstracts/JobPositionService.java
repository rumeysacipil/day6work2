package com.example.Hrms.business.abstracts;

import java.util.List;

import com.example.Hrms.entities.concretes.jobposition;

public interface JobPositionService {

	List<jobposition> getAll();
}
