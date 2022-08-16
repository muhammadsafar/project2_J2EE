package com.dreamlearnpath.msbahrddin.model;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String nip;
	private Integer age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String nip, Integer age) {
		super();
		this.name = name;
		this.nip = nip;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
