package com.example.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "favorites_packages")
public class FavoritePackage {
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamePackage() {
		return namePackage;
	}

	public void setNamePackage(String namePackage) {
		this.namePackage = namePackage;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public int getMaximumPeople() {
		return maximumPeople;
	}

	public void setMaximumPeople(int maximumPeople) {
		this.maximumPeople = maximumPeople;
	}
	
	/*@Lob
	@ManyToOne
	@JoinColumn(name = "package_travel_id", nullable = false)
	private PackageTravel packageTravel;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user_id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PackageTravel getPackageTravel() {
		return packageTravel;
	}

	public void setPackageTravel(PackageTravel packageTravel) {
		this.packageTravel = packageTravel;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
*/

	
}