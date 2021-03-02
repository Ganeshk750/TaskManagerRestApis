package com.ganesh.apis.db_data;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.apis.model.ClientLocation;
import com.ganesh.apis.repository.ClientLocationRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DBOperationRunner implements CommandLineRunner {
	
	private final ClientLocationRepository clientLocation;

	@Override
	public void run(String... args) throws Exception {
		
		clientLocation.saveAll(Arrays.asList(
				   new ClientLocation(1, "Boston"),
				   new ClientLocation(2, "New Delhi"),
				   new ClientLocation(3, "New Jersy"),
				   new ClientLocation(4, "New York"),
				   new ClientLocation(5, "London"),
				   new ClientLocation(6, "Tokyo")
				   
				));
		System.out.println("----------All Client Location Data saved into Database--------------");
		
	}
	

}
