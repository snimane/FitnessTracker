package com.service;

import java.util.List;

import com.model.Activity;
import com.model.Exercise;

public interface ExerciseService {
	public Exercise save(Exercise exercice);
	List<Activity> findAllActivities();

}