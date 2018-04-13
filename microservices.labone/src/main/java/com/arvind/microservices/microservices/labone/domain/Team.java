package com.arvind.microservices.microservices.labone.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Team {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId")
	private Set<Player> playerList;
	
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(Set<Player> playerList) {
		this.playerList = playerList;
	}

	public Team(String name, String location,  Set<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
		this.location = location;
	}

	public Team() {
		
		
	}
	
	

}
