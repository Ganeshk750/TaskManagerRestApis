package com.ganesh.apis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.apis.model.ClientLocation;
import com.ganesh.apis.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

	List<ClientLocation> save(List<ClientLocation> list);

}
