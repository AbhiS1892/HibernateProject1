package com.abhi.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE_DETAILS")
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="VEHICLE_TYPE",
//                     discriminatorType=DiscriminatorType.STRING
//		)
public class Vehicle {
	@Id	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="VEHICLE_ID")
	private int vehicleID;
	@Column(name="VEHICLE_NAME")
	private String vehicleName;
//	@ManyToOne
//	@JoinColumn(name="USER_ID")
//	@ManyToMany(mappedBy="vehicle")
//	private Collection<UserDetails> userList = new ArrayList<UserDetails>();
		
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
//	public Collection<UserDetails> getUserList() {
//		return userList;
//	}
//	public void setUserList(Collection<UserDetails> userList) {
//		this.userList = userList;
//	}
}
