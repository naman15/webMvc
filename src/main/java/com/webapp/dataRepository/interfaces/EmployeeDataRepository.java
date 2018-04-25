package com.webapp.dataRepository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.entities.Employee;

@Repository
public interface EmployeeDataRepository extends JpaRepository<Employee, Integer>
{
	
}
