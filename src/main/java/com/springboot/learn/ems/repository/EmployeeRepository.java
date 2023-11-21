package com.springboot.learn.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.learn.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	//List<Employee> findAllById(Iterable<Long> ids);
}
