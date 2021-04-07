package com.ggomjae.gom.apibasicmanagement.controller;

import com.ggomjae.gom.apibasicmanagement.dto.RequestCreateEmployeeDto;
import com.ggomjae.gom.apibasicmanagement.dto.ServiceCreateEmployeeDto;
import com.ggomjae.gom.apibasicmanagement.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/employee")
    public void createEmplyee(@RequestBody RequestCreateEmployeeDto requestCreateEmployeeDto){
        employeeService.createEmployee(ServiceCreateEmployeeDto.builder()
            .employeeName(requestCreateEmployeeDto.getEmployeeName())
            .build());
    }
}
