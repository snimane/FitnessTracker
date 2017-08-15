package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Goal;
import com.model.GoalReport;
import com.repository.IGoalRepo;

@Service("goalService")
public class GoalService implements IGoalService {

	@Autowired
	IGoalRepo goalRepository;

	@Transactional
	public Goal save(Goal g) {
		return goalRepository.save(g);

	}

	@Transactional
	public List<Goal> findAllGoals() {
		// TODO Auto-generated method stub
		return goalRepository.loadAll();
	}
	@Transactional
	public List<GoalReport> findAllGoalReports() {
		
if(goalRepository.getReport()==null){
		return goalRepository.getReport();
}else{
	
	GoalReport g=new GoalReport(2,3 ,"bike");
	
	List l=new ArrayList();
	l.add(g);
	return l;
	
}
	}

}
