package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Exercise;

@Repository("exerciceRepository")
public interface IExerciceRepository extends JpaRepository<Exercise, Long>{
	
	

}
