package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Exercise {
	@Id
	@GeneratedValue
	int id;
	
	@ManyToOne
	private Goal goal;
	
	
	
	@Range(min = 1, max = 120)
	private int minutes;

	@NotNull
	private String activity;

	public String getActivity() {
		return activity;
	}

	public Goal getGoal() {
		return goal;
	}

	public int getId() {
		return id;
	}
	
	public int getMinutes() {
		return minutes;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}


}
