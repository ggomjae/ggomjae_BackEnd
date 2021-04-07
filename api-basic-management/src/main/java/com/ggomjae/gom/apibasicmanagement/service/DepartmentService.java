package com.ggomjae.gom.apibasicmanagement.service;


import com.ggomjae.gom.apibasicmanagement.JPARepository.DepartmentRepository;
import com.ggomjae.gom.apibasicmanagement.dto.ServiceCreateDepartmentDto;
import com.ggomjae.gom.modulebasicdb.department.Department;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Transactional
    public void createDepartment(ServiceCreateDepartmentDto serviceCreateDepartmentDto){
        Department department = departmentRepository.save(serviceCreateDepartmentDto.toDepartment());
        log.info("dapartment : {}", department);
    }

    @Transactional(readOnly = true)
    public void retrieveDepartment(){

    }
}
