package com.knoldus.springdatajpaexample.repository;

import com.knoldus.springdatajpaexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
