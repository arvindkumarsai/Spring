package com.arvind.microservices.microservices.labone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.arvind.microservices.microservices.labone.domain.Player;

@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
