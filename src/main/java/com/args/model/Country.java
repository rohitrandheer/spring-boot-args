package com.args.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country {
	
	@Id
	@Column(name = "country_id")
	private String customerNumber;
	
	@Column(name = "country_name")
	private String customerName;
	
	@Column(name = "region_id")
	private Integer regionId;
	
	@Override
	public String toString() {
		return this.customerNumber + " " + 
				this.customerName + " " + 
				this.regionId;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
}
 