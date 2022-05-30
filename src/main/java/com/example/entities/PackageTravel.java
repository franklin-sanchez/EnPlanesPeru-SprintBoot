package com.example.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "package")
public class PackageTravel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name_package", nullable = false)
	private String namePackage;
	
	@Column(name = "package_start_date", nullable = false) 
	private Date dateStart;
	
	@Column(name = "package_end_date", nullable = false)
	private Date dateEnd;
	
	@Column(name = "maximum_people", nullable = false)
	private int maximumPeople ;
	
	@Column(name = "price", nullable = false)
	private double price ;
	
	@Column(name = "offer", nullable = false)
	private int offer;
	
	@Column(name = "days", nullable = false)
	private int days;
	
	@ManyToOne
	@JoinColumn(name = "department_id", nullable = false)
	private Department department;

	@ManyToOne
	@JoinColumn(name = "province_id", nullable = false)
	private Province province;
}
