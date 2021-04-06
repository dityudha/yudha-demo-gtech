package com.project.yudhademo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member")

public class MemberEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	    private Integer memberId;
	    
	    @Column(name = "first_name", nullable = false)
	    private String firstName;
	    
	    @Column(name = "last_name", nullable = false)
	    private String lastName;
	    
	    @Column(name = "gender", nullable = false)
	    private String gender;
	    
	    @Column(name = "dob", nullable = false)
	    private String dob;
	    
	    @Column(name = "mobile_phone", nullable = false)
	    private String mobile_phone;
	    
	    @Column(name = "email", nullable = false)
	    private String email;
	    
	    

		public Integer getMemberId() {
			return memberId;
		}

		public void setMemberId(Integer memberId) {
			this.memberId = memberId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getMobile_phone() {
			return mobile_phone;
		}

		public void setMobile_phone(String mobile_phone) {
			this.mobile_phone = mobile_phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
  
	    
}
