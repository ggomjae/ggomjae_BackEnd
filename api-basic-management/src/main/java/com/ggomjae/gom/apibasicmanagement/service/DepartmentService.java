package com.ggomjae.gom.apibasicmanagement.service;


import com.ggomjae.gom.apibasicmanagement.JPARepository.DepartmentRepository;
import com.ggomjae.gom.apibasicmanagement.dto.ServiceCreateDepartmentDto;
import com.ggomjae.gom.modulebasicdb.department.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Transactional
    public void createDepartment(ServiceCreateDepartmentDto serviceCreateDepartmentDto){
        departmentRepository.save(serviceCreateDepartmentDto.toDepartment());
    }

    @Transactional(readOnly = true)
    public void retrieveDepartment(){

    }
}
