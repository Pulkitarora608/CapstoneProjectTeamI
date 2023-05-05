package com.incedo.smartinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.smartinventory.entity.Supplier;




@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
	
