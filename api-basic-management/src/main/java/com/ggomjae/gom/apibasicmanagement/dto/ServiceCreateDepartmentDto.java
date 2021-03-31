package com.ggomjae.gom.apibasicmanagement.dto;

import com.ggomjae.gom.modulebasicdb.department.Department;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ServiceCreateDepartmentDto {
    private final String departmentName;

    @Builder
    public ServiceCreateDepartmentDto(String departmentName){
        this.departmentName = departmentName;
    }

    public Department toDepartment(){
        return Department.builder()
                .departmentName(this.departmentName)
                .build();
    }
}
