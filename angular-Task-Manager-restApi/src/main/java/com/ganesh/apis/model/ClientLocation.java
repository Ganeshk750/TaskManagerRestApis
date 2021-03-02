package com.ganesh.apis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="clientlocations")
@NoArgsConstructor
@AllArgsConstructor
public class ClientLocation {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer clientLocationId;
	private String clientLocationName;
	
	
}
