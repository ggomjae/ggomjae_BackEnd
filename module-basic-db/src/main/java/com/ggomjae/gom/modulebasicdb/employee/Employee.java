package com.ggomjae.gom.modulebasicdb.employee;

import com.ggomjae.gom.modulebasicdb.department.Department;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "employee_name")
    private String employeeName;

    @JoinColumn(name = "department_id")
    @ManyToOne
    private Department department;
}
