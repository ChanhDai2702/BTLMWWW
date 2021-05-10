package com.fit.se.webbanhang.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "TypeProduct")
public class TypeProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int typeID;
	
	@Column(name = "typeName")
	private String typeName;

	@OneToMany(targetEntity=Glass.class, mappedBy="typeProduct", fetch=FetchType.EAGER)
	private List<Glass> glasses;

	public TypeProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeProduct(int typeID, String typeName) {
		super();
		this.typeID = typeID;
		this.typeName = typeName;
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<Glass> getGlasses() {
		return glasses;
	}

	public void setGlasses(List<Glass> glasses) {
		this.glasses = glasses;
	}

	@Override
	public String toString() {
		return "TypeProduct [typeID=" + typeID + ", typeName=" + typeName + ", glasses=" + glasses + "]";
	}
	
	
}
