package com.arvind.microservices.microservices.labone.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.arvind.microservices.microservices.labone.domain.Team;
import com.arvind.microservices.microservices.labone.repository.TeamRepository;

@org.springframework.web.bind.annotation.RestController
public class RestTeamController {

	
	List<Team> teamRepositoryList = new ArrayList<>();
	
	@Autowired
	TeamRepository teamRepository;
	
	
	@PostConstruct
	  public List<Team> getTeamsInit() {

	  	Team team = new Team();
	  	team.setId(0l);
	  	team.setLocation("Harlem");
	  	team.setName("Globetrotters");
	  	teamRepositoryList.add(team);
	  	
	  	team = new Team();
	  	team.setId(1l);
	  	team.setLocation("Washington");
	  	team.setName("Generals");
	  	teamRepositoryList.add(team);
	  	
	  	return teamRepositoryList;
	  }

	
	
	
	@GetMapping("/teamsSimple")
	  public Iterable<Team> getTeamsSimple() {
	  	return teamRepositoryList;
	  			
	  }
	
	@GetMapping("/teams")
	public List<Team> getTeams() {
		return teamRepository.findAll();
		
	}
}
