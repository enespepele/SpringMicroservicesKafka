package com.enesppl.employeeservice.service;

import com.enesppl.employeeservice.dto.APIResponseDto;
import com.enesppl.employeeservice.dto.EmployeeDto;

public interface EmployeeService         {



EmployeeDto saveEmployee(EmployeeDto employeeDto);
APIResponseDto getEmployeeById(Long employeeId);


}
