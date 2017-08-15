package com.repository;

import java.util.List;

import com.model.Goal;
import com.model.GoalReport;

public interface IGoalRepo {
	
	
	Goal save(Goal g);

	List<Goal> loadAll();

	List<GoalReport> getReport();

}
