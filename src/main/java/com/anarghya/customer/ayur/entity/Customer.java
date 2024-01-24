package com.anarghya.customer.ayur.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Anarghyacustomer")
public class Customer {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerName;
    @Column(unique = true)
    private String emailId;
    @Column(unique = true)
    private String mobileNumber;
    private String password; 
    private String address;
    private String status;
    private int failedLoginAttempts;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getFailedLoginAttempts() {
		return failedLoginAttempts;
	}
	public void setFailedLoginAttempts(Integer failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(Long customerId, String customerName, String emailId, String mobileNumber, String password,
			String address, String status, Integer failedLoginAttempts) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.address = address;
		this.status = status;
		this.failedLoginAttempts = failedLoginAttempts;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", password=" + password + ", address=" + address + ", status="
				+ status + ", failedLoginAttempts=" + failedLoginAttempts + "]";
	}
	
	
	
}
