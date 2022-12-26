package com.springbootorm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Company {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "compid")
	private int cId;
	@Column(name = "compname", length = 20)
	private String cName;
	@Column(name = "complocation")
	private String cLocation;
	@Column(name = "comppincode")
	private int cPincode;
}
