package com.dailycodebuffer.Springboottutorial.service;

import com.dailycodebuffer.Springboottutorial.entity.Department;
import com.dailycodebuffer.Springboottutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
