package com.incedo.smartinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.smartinventory.entity.Employee;
import com.incedo.smartinventory.entity.Return;

@Repository
public interface ReturnRepository extends JpaRepository<Return, Long>  {
	
	
	

}
