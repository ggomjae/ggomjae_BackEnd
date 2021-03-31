package com.ggomjae.gom.apibasicmanagement.JPARepository;

import com.ggomjae.gom.modulebasicdb.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
