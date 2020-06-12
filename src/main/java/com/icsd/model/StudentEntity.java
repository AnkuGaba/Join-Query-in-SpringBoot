package com.icsd.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@Table(name = "Student", schema = "dbo", catalog = "KSCDatabase")
@Table(name = "Student")
public class StudentEntity {	
    private int rollNumber;
    private String name;
    private int departmentId;
    private int age;
    private String email;
    
    @Id
    @Column(name = "rollNumber")
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	@Basic
    @Column(name = "Name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Basic
    @Column(name = "DepartmentId")
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	@Basic
    @Column(name = "age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Basic
    @Column(name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
	
	
	
//	private int rollNumber;
//    private String name;
//    private Integer departmentId;
//    private Integer age;
//    private String email;
//
//    @Id
//    @Column(name = "rollNumber")
//    public int getRollNumber() {
//        return rollNumber;
//    }
//
//    public void setRollNumber(int rollNumber) {
//        this.rollNumber = rollNumber;
//    }
//
//    @Basic
//    @Column(name = "Name")
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Basic
//    @Column(name = "DepartmentId")
//    public Integer getDepartmentId() {
//        return departmentId;
//    }
//
//    public void setDepartmentId(Integer departmentId) {
//        this.departmentId = departmentId;
//    }
//
//    @Basic
//    @Column(name = "age")
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @Basic
//    @Column(name = "email")
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
}
