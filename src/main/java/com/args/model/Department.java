package com.args.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {

	@Id
	@Column(name = "department_id")
	private String departmentId;

	@Column(name = "department_name")
	private String departmentName;

	@Column(name = "manager_id")
	private Integer managerId;

	@Column(name = "location_id")
	private String locationId;

	@Override
	public String toString() {
		return this.departmentId + " " + this.departmentId + " " + this.managerId + " " + this.locationId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

}
