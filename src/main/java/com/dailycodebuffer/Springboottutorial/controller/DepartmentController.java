package com.dailycodebuffer.Springboottutorial.controller;

import com.dailycodebuffer.Springboottutorial.entity.Department;
import com.dailycodebuffer.Springboottutorial.service.DepartmentService;
import com.dailycodebuffer.Springboottutorial.service.DepartmentServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department ){
        DepartmentService service = new DepartmentServiceImpl();
    }
}
