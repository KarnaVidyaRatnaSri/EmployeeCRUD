package com.sample.crudDemo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.crudDemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findBySalary(double salary);
    List<Employee> findByPosition(String position);
}
