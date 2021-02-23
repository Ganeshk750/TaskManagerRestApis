package com.ganesh.apis.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name="projects")
public class Project {
	
	@Id
	private Integer projectId;
	private String projectName;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOfStart;
	private int teamSize;
	private boolean active;
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="location")
	private ClientLocation clientLocation;
	
	// Relation With ClientLocation

}
