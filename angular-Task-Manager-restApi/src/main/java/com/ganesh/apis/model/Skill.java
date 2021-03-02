package com.ganesh.apis.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="skills")
public class Skill {
	
	@Id
	private int skillId;
	private String skillName;
	private String skillLevel;
	//private String Id;
	
	// Relation with User
//	@ManyToMany(fetch = FetchType.LAZY)
//	private Set<User> user;
//	

}
