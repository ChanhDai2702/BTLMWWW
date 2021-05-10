package com.fit.se.webbanhang.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fit.se.webbanhang.entity.InvoiceDetails;

@Repository
public interface InvoiceDetailsRepository extends CrudRepository<InvoiceDetails, Integer> {

}
