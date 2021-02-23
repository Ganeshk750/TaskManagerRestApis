package com.ganesh.apis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.apis.model.ClientLocation;

public interface ClientLocationRepository extends JpaRepository<ClientLocation, Integer> {

}
