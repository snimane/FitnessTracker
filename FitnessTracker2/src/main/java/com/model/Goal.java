package com.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;


@Entity

@Table(name="goals")

public class Goal {
	@Id
	@GeneratedValue
	@Column(name="goal_id")
	
	
	int id;
	
	@Range(min = 1, max = 120)
	@Column(name="minute")
	private int minutes;
	
 @OneToMany(mappedBy="goal",cascade=javax.persistence.CascadeType.ALL, fetch=FetchType.LAZY)
 
private List<Exercise> exercices =new ArrayList<Exercise>();

	
	

	public List<Exercise> getExercices() {
	return exercices;
}

public void setExercices(List<Exercise> exercices) {
	this.exercices = exercices;
}



	public int getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	
  
	
	
	
}
