package com.ganesh.apis.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="project")
public class Project {
	
	private int projectId;
	private String projectName;
	private Date dateOfStart;
	private int teamSize;
	private boolean active;
	private String status;
	
	// Relation With ClientLocation

}
