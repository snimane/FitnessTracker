package com.service;

import java.util.List;

import com.model.Goal;
import com.model.GoalReport;

public interface IGoalService {
	
	
	public Goal save (Goal g);

	public List<Goal> findAllGoals();

	public List<GoalReport> findAllGoalReports();

}
