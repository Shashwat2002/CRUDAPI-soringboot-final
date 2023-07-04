package com.swt.repository;

import java.util.List;
import java.util.Optional;

import com.swt.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import com.swt.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee findByEmpcity(String emp_city);

	Optional<List<Employee>> findByEmpageGreaterThan(int emp_age);

}
