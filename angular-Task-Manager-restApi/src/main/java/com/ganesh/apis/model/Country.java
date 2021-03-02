package com.ganesh.apis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="countories")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Country {
	
    @Id
	private Integer countryId;
	private String countryName;

}
