package com.ggomjae.gom.apibasicmanagement.dto;

import com.ggomjae.gom.modulebasicdb.department.Department;
import com.ggomjae.gom.modulebasicdb.employee.Employee;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ServiceCreateEmployeeDto {
    private final String employeeName;

    @Builder
    public ServiceCreateEmployeeDto(String employeeName) {
        this.employeeName = employeeName;
    }

    public Employee toEmployee(Department department) {
        return Employee.builder()
                .employeeName(this.employeeName)
                .department(department)
                .build();
    }
}
