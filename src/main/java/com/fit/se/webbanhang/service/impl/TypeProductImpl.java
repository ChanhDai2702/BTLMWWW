package com.fit.se.webbanhang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.se.webbanhang.entity.TypeProduct;
import com.fit.se.webbanhang.repository.TypeProductRepository;
import com.fit.se.webbanhang.service.TypeProductService;
@Service
public class TypeProductImpl implements TypeProductService {
	@Autowired
	private TypeProductRepository typeProductRepository;
	
	@Override
	public List<TypeProduct> getAllTypeProduct() {
		// TODO Auto-generated method stub
		return (List<TypeProduct>) typeProductRepository.findAll();
	}

	@Override
	public boolean saveTypeProduct(TypeProduct tp) {
		try {
			typeProductRepository.save(tp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeTypeProduct(int id) {
		try {
			typeProductRepository.deleteById(id);;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public TypeProduct getTypeProductbyName(String name) {
		// TODO Auto-generated method stub
		return typeProductRepository.geTypeProductByName(name);
	}

}
