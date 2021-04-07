package com.ggomjae.gom.apibasicmanagement.service;

import com.ggomjae.gom.apibasicmanagement.JPARepository.DepartmentRepository;
import com.ggomjae.gom.apibasicmanagement.JPARepository.EmployeeRepository;
import com.ggomjae.gom.apibasicmanagement.dto.ServiceCreateEmployeeDto;
import com.ggomjae.gom.modulebasicdb.department.Department;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Slf4j
@RequiredArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final EntityManager entityManager;

    @Transactional
    public void createEmployee(ServiceCreateEmployeeDto serviceCreateEmployeeDto){

        // 임시
        Department department = departmentRepository.findById(1L).orElseThrow( () -> new RuntimeException("NOT FOUND"));
        employeeRepository.save(serviceCreateEmployeeDto.toEmployee(department));
    }

    @Transactional(readOnly = true)
    public void retrieveEmployee(){
        return ;
    }
}
