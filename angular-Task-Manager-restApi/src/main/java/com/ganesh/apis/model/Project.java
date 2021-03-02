package com.ganesh.apis.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="projects")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Project {
	
	@Id
	private Integer projectId;
	private String projectName;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOfStart;
	private int teamSize;
	private String status;
	private boolean active;
	public int ClientLocationId;

	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="location_id", referencedColumnName = "clientLocationId")
	//private ClientLocation clientLocationId;


}
