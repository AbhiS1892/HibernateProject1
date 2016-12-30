package com.abhi.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table (name="USER_DETAILS")
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;
	@Column(name="USER_NAME")
	private String userName;
	
//	@OneToMany(mappedBy="user")
//	@JoinColumn(name="VEHICLE_ID")
//	@JoinTable(name="USER_VEHICLES", 
//	           joinColumns=@JoinColumn(name="USER_ID"),
//	           inverseJoinColumns=@JoinColumn(name="VEHICLE_ID")
//	)
//	@ManyToMany
//	@JoinTable(name="USER_VEHICLES", 
//    		   joinColumns=@JoinColumn(name="USER_ID"),
//               inverseJoinColumns=@JoinColumn(name="VEHICLE_ID")
//	)
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="USER_VEHICLES", 
	           joinColumns=@JoinColumn(name="USER_ID"),
	inverseJoinColumns=@JoinColumn(name="VEHICLE_ID")
			)
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	
//	@ElementCollection(fetch=FetchType.EAGER)
//	@JoinTable(name="USER_ADDRESS", joinColumns=@JoinColumn(name="USER_ID"))
//	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
//	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type = "long"))
//	private Collection<Address> listOfAddresses = new ArrayList<>();
	
	
//	@Column(name="USER_CONACT_NO")
//	private String phoneNumber;
//	@Temporal (TemporalType.DATE)
//	@Column(name="USER_DOB")
//	private Date dateOfBirth;
//	@Embedded
//	@AttributeOverrides(value = {
//	@AttributeOverride(name = "street", column = @Column(name="HOME_STREET_NAME")),
//	@AttributeOverride(name = "city", column = @Column(name="HOME_CITY_NAME")),
//	@AttributeOverride(name = "state", column = @Column(name="HOME_STATE_NAME")),
//	@AttributeOverride(name = "pincode", column = @Column(name="HOME_AREA_PINCODE")),
//	})
//	private Address homeAddress;
//	@Embedded
//	private Address officeAddress;

	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
//	public String getPhoneNumber() {
//		return phoneNumber;
//	}
//	public void setPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//	public Date getDateOfBirth() {
//		return dateOfBirth;
//	}
//	public void setDateOfBirth(Date dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}
//	public Address getHomeAddress() {
//		return homeAddress;
//	}
//	public void setHomeAddress(Address homeAddress) {
//		this.homeAddress = homeAddress;
//	}
//	public Address getOfficeAddress() {
//		return officeAddress;
//	}
//	public void setOfficeAddress(Address officeAddress) {
//		this.officeAddress = officeAddress;
//	}
//	public Collection<Address> getListOfAddresses() {
//		return listOfAddresses;
//	}
//	public void setListOfAddresses(Collection<Address> listOfAddresses) {
//		this.listOfAddresses = listOfAddresses;
//	}

}
