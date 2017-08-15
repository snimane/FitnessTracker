package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.Goal;
import com.model.GoalReport;
import com.service.IGoalService;

@Controller
@SessionAttributes("goal")
public class GoalController {
	
	@Autowired
	private IGoalService goalService;

	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String addGoal(Model model) {
		Goal goal = new Goal();
		goal.setMinutes(10);
		model.addAttribute("goal", goal);
		
		return "addGoal";
	}
	
	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result) {
		
		System.out.println("result has errors: " + result.hasErrors());
		
		System.out.println("Goal set: " + goal.getMinutes());
		
		if(result.hasErrors()) {
			return "addGoal";
		}
		else {
			
			goalService.save(goal);
			
		}
		
		return "redirect:index.jsp";
	}
	// "getGoals" the same name of the jsp
	@RequestMapping(value = "getGoals", method = RequestMethod.GET)
	public String getGoals(Model m){
		
		List<Goal> goals=goalService.findAllGoals();
		//"goals" le meme nom dans la jsp c le mapping
		m.addAttribute("goals",goals);
		return "getGoals";
		
		
		
	}
	
	@RequestMapping(value = "getGoalReport", method = RequestMethod.GET)
	
	public String getGoalReports(Model m){
		
		if(goalService.findAllGoalReports()==null){
			
			return "redirect:index.jsp";
			
		}else{
		
		
		List<GoalReport> goalReports=goalService.findAllGoalReports();
		
		m.addAttribute("goalReports",goalReports);
		return "getGoalReport";
		
	}}
	
	
}
