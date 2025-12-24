package com.example.employee.project.controller;


import com.example.employee.project.Service.employeeService;
import com.example.employee.project.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://127.0.0.1:5500")
public class employeeController {


    @Autowired
    employeeService employeeservice;

    @GetMapping("/employee")
    public List<employee> allemployee(){
        return employeeservice.allemployee();
    }

    @PostMapping("/employee/register")
    public String updatedetails(
                                @RequestParam("e_name") String e_name,
                                @RequestParam("e_salary") int e_salary,
                                @RequestParam("e_id") int e_id,
                                @RequestParam("e_work_status") String e_work_status
                                ){
        return employeeservice.updatedetails(e_name,e_salary,e_id,e_work_status);

    }

//    @PostMapping("/employees/register")
//    public String updatedetailss(@RequestBody employee emp){
//        return employeeservice.updatedetailss(e_rollno,e_name,e_salary,e_id,e_work_status);
//
//    }

}
