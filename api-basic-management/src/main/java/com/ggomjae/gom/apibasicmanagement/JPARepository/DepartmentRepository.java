package com.ggomjae.gom.apibasicmanagement.JPARepository;

import com.ggomjae.gom.modulebasicdb.department.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
