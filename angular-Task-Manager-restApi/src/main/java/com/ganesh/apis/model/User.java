package com.ganesh.apis.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer userId;
	 private String firstName;
	 private String lastName;
	 private String Email;
     private String Mobile;
     @DateTimeFormat(pattern = "dd/MM/yyyy")
     private String DateOfBirth;
     private String Password;
     private String Gender;
     private boolean ReceiveNewsLetters;
     
   //  @OneToOne(cascade = CascadeType.ALL)
   //  @JoinColumn(name="country_id")
    // private Country countryID;
   //  
   //  @ManyToMany(mappedBy="user", cascade = CascadeType.ALL)
   //  private Set<Skill> skills;
     
     

}
