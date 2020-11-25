package com.ganesh.apis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="clientlocation_table")
public class ClientLocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientLocationId;
	private String clientLocationName;
	
	
}
