package com.fit.se.webbanhang.service;

import java.util.List;

import com.fit.se.webbanhang.entity.TypeProduct;

public interface TypeProductService {
	public List<TypeProduct> getAllTypeProduct();
	
	public boolean saveTypeProduct(TypeProduct tp);
	
	public boolean removeTypeProduct(int id);
	
	public TypeProduct getTypeProductbyName(String name);
}
