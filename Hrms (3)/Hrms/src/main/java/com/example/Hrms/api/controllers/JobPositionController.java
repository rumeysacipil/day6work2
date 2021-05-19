package com.example.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hrms.business.abstracts.JobPositionService;
import com.example.Hrms.entities.concretes.jobposition;

@RestController
@RequestMapping("/api/jobposition")

public class JobPositionController {
 private JobPositionService jobPositionService;

 @Autowired
public JobPositionController(JobPositionService jobPositionService) {
	super();
	this.jobPositionService = jobPositionService;
}
@GetMapping("/getall")
public List<jobposition>getAll(){
	return this.jobPositionService.getAll();
}
 
}
