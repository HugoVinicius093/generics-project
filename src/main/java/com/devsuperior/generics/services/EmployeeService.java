package com.devsuperior.generics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.devsuperior.generics.dto.EmployeeDTO;
import com.devsuperior.generics.entities.Employee;
import com.devsuperior.generics.repositories.EmployeeRepository;

@Service
public class EmployeeService implements GenericService<Employee, EmployeeDTO, Long> {

	@Autowired
	private EmployeeRepository repository;
		
	@Override
	public JpaRepository<Employee, Long> getRepository() {
		return repository;
	}	
}
