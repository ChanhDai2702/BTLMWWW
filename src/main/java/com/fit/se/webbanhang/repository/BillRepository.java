package com.fit.se.webbanhang.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fit.se.webbanhang.entity.Bill;

@Repository
public interface BillRepository extends CrudRepository<Bill, Integer> {

}
