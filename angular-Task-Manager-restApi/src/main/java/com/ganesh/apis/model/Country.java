package com.ganesh.apis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="countrys")
public class Country {
	
    @Id
	private Integer countryId;
	private String countryName;

}
