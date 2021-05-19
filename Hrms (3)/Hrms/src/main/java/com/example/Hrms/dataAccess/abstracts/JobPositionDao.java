package com.example.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Hrms.entities.concretes.jobposition;

public interface JobPositionDao extends JpaRepository<jobposition,Integer> {
  
}
