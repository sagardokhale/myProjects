package com.example.practice.domain;

import java.util.concurrent.atomic.AtomicInteger;

public class User {
	
	private int userId;
	private String userName;
	private String address;
	private long mobileNumber;
	private String qualification;
	private String job;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if((this==null)||this.getClass()!=obj.getClass())
			return false;
		User user=(User)obj;
		return (this.userId==user.userId && this.mobileNumber==user.mobileNumber && (this.userName!=null&&(this.userName==user.userName&&this.userName.equals(user.userName)))
				&& (this.address!=null&&(this.address==user.address&&this.address.equals(user.address)))
						&& (this.qualification!=null&&(this.qualification==user.qualification&&this.qualification.equals(user.qualification)))
								&& (this.job!=null&&(this.job==user.job&&this.job.equals(user.job))));
	}
	
	
	@Override
	public int hashCode() {
		int hash=7;
		hash=hash+hash*userId*(int)mobileNumber;
		return hash+(userName==null?0:userName.hashCode())+(qualification==null?0:qualification.hashCode())+(address==null?0:address.hashCode())+(job==null?0:job.hashCode());
	}
	

}
