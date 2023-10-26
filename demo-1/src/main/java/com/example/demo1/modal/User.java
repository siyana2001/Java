package com.example.demo1.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table (name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	    private int id;
	    private String name;
	    private String mail;
	    private String phone;
	    private String password;

	    @Column(name = "is_delete")
	    private Boolean isDelete;

//	    @Column(name = "is_active")
//	    private Boolean isActive;

	    // Getters and setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getMail() {
	        return mail;
	    }

	    public void setMail(String mail) {
	        this.mail = mail;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public Boolean getIsDelete() {
	        return isDelete;
	    }

	    public void setIsDelete(Boolean isDelete) {
	        this.isDelete = isDelete;
	    }

//	    public Boolean getIsActive() {
//	        return isActive;
//	    }
//
//	    public void setIsActive(Boolean isActive) {
//	        this.isActive = isActive;
//	    }
	}
