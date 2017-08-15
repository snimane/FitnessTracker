package com.model;

public class GoalReport {
	private int goalMunites;
	private int exerciceMunites;
	private String exerciceActivity;
	public GoalReport(int goalMunites, int exerciceMunites, String exerciceActivity) {
	
		this.goalMunites = goalMunites;
		this.exerciceMunites = exerciceMunites;
		this.exerciceActivity = exerciceActivity;
	}
	
	public String getExerciceActivity() {
		return exerciceActivity;
	}
	public int getExerciceMunites() {
		return exerciceMunites;
	}
	public int getGoalMunites() {
		return goalMunites;
	}
	public void setExerciceActivity(String exerciceActivity) {
		this.exerciceActivity = exerciceActivity;
	}
	public void setExerciceMunites(int exerciceMunites) {
		this.exerciceMunites = exerciceMunites;
	}
	public void setGoalMunites(int goalMunites) {
		this.goalMunites = goalMunites;
	}
	
	
	

}
