package com.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.model.Goal;
import com.model.GoalReport;



@Repository("goalRepository")
public class GoalRepo implements IGoalRepo{
	@PersistenceContext 
	private EntityManager em;
	

	public Goal save(Goal g) {
		
	
		em.persist(g);
		em.flush();
		return g;
	
	}


	public List<Goal> loadAll() {
		
		javax.persistence.Query q=em.createQuery("select g from Goal g");
		
		List goals=q.getResultList();

		return goals;
	}


	public List<GoalReport> getReport() {
		
		javax.persistence.Query query=em.createQuery("Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) from Goal g , Exercise e where g.id=e.goal.id");
		
		return query.getResultList();
	}

}