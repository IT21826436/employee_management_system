package com.example.employeeapi.controller;

import com.example.employeeapi.controller.request.EmployeeRequest;
import com.example.employeeapi.controller.response.EmployeeResponse;
import com.example.employeeapi.exception.DepartmentNotFoundException;
import com.example.employeeapi.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("/employees")
    public EmployeeResponse registerEmployee(@RequestBody EmployeeRequest employeeRequest) throws DepartmentNotFoundException {

        return employeeService.registerEmployee(employeeRequest);

    }

    
}
