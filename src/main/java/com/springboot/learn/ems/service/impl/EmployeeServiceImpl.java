package com.springboot.learn.ems.service.impl;

import org.springframework.stereotype.Service;

import com.springboot.learn.ems.dto.EmployeeDto;
import com.springboot.learn.ems.entity.Employee;
import com.springboot.learn.ems.exception.ResourceNotFoundException;
import com.springboot.learn.ems.mapper.EmployeeMapper;
import com.springboot.learn.ems.repository.EmployeeRepository;
import com.springboot.learn.ems.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
private static final String EMPLOYEE_NOT_FOUND="Employee is not exists with given id";
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {

		Employee employee = EmployeeMapper.maptoEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	} 

	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId)
		.orElseThrow(()-> new ResourceNotFoundException(EMPLOYEE_NOT_FOUND+":"+employeeId));
		
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

}
