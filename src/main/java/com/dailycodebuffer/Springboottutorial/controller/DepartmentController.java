package com.dailycodebuffer.Springboottutorial.controller;

import com.dailycodebuffer.Springboottutorial.entity.Department;
import com.dailycodebuffer.Springboottutorial.service.DepartmentService;
import com.dailycodebuffer.Springboottutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department ){
        //DepartmentService service = new DepartmentServiceImpl(); // This gives control to me, should be automatic
            return departmentService.saveDepartment(department);

        }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
            return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted success";
    }

    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
    }


}
