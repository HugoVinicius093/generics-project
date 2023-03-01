package com.devsuperior.generics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.generics.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
