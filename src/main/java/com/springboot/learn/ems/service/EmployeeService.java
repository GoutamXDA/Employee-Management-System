package com.springboot.learn.ems.service;

import com.springboot.learn.ems.dto.EmployeeDto;

public interface EmployeeService {
EmployeeDto createEmployee(EmployeeDto employeeDto);

EmployeeDto getEmployeeById(Long employeeId);

}
