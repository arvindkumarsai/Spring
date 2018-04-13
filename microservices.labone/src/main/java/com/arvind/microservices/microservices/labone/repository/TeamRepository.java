package com.arvind.microservices.microservices.labone.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.arvind.microservices.microservices.labone.domain.Team;

@RestResource(path="teams", rel="team") 
public interface TeamRepository  extends CrudRepository<Team, Long>{

	List<Team> findAll();

}
