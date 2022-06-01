package com.example.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name_user", nullable = false)
	private String nameUser;
	
	@Column(name = "mail", nullable = false, length = 30)
	private String mail;

	@Column(name = "celphone", length = 25)
	private Long celphone;
	
	@Column(name = "comment", nullable = false, length = 500)
	private String comment;
	
	@Column(name = "valoration", length = 25)
	private Long valoration;
	

	public Long getValoration() {
		return valoration;
	}

	public void setValoration(Long valoration) {
		this.valoration = valoration;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Long getCelphone() {
		return celphone;
	}

	public void setCelphone(Long celphone) {
		this.celphone = celphone;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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