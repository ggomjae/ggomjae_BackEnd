package com.ggomjae.gom.apibasicmanagement.controller;

import com.ggomjae.gom.apibasicmanagement.dto.RequestCreateDepartmentDto;
import com.ggomjae.gom.apibasicmanagement.dto.ServiceCreateDepartmentDto;
import com.ggomjae.gom.apibasicmanagement.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/department")
    public void createDepartment(@RequestBody RequestCreateDepartmentDto requestCreateDepartmentDto){
        departmentService.createDepartment(ServiceCreateDepartmentDto.builder()
            .departmentName(requestCreateDepartmentDto.getDepartmentName())
            .build());
    }
}
