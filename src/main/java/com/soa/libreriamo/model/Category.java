package com.soa.libreriamo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "code", unique = true)
	private String code;
	@Column(name = "description")
	private String description;

}
