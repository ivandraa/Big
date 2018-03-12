package com.java.big.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "generalcase")
public class GeneralCase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="field1")
	private String field1;
	@Column(name="field2")
	private String field2;
	@Column(name="field3")
	private String field3;
	@Column(name="field4")
	private String field4;
	@Column(name="field5")
	private String field5;
	
	
	public GeneralCase() {
		
	}

	public GeneralCase(int id, String name, String field1, String field2, String field3, String field4, String field5) {
		this.id = id;
		this.name = name;
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
		this.field5 = field5;
	}
	
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

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getField4() {
		return field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	public String getField5() {
		return field5;
	}

	public void setField5(String field5) {
		this.field5 = field5;
	}

	@Override
	public String toString() {
		return "GeneralCase [id=" + id + ", name=" + name + ", field1=" + field1 + ", field2=" + field2 + ", field3="
				+ field3 + ", field4=" + field4 + ", field5=" + field5 + "]";
	}
	
}
