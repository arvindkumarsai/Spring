package com.arvind.microservices.eurekaclient;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arvind.microservices.eurekaclient.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
