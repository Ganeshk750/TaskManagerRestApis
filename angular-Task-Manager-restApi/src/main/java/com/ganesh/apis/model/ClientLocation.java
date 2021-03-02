package com.ganesh.apis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="clientlocations")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ClientLocation {
	
	@Id
	private Integer clientLocationId;
	private String clientLocationName;
	
	// @OneToOne(mappedBy = "clientLocation")
	// private Project project;
	
	
}
