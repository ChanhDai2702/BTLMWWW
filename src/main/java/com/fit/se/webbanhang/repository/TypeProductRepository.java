package com.fit.se.webbanhang.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fit.se.webbanhang.entity.TypeProduct;


@Repository
public interface TypeProductRepository extends CrudRepository<TypeProduct, Integer> {
	  @Query(value = "SELECT * FROM TypeProduct n WHERE n.typeName=?", nativeQuery = true)
	    public TypeProduct geTypeProductByName(String typename);
}
