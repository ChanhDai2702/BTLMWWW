package com.fit.se.webbanhang.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fit.se.webbanhang.entity.Glass;

@Repository
public interface GlassRepository extends CrudRepository<Glass, Integer> {
	
	@Query(value = "select * from glass g join type_product tp on g.typeid = tp.typeid where tp.type_name = ?", nativeQuery = true)
	public List<Glass> getGlassbyTypeProductName(String name);
}
