package com.example.employee.project.Service;

import com.example.employee.project.Repository.employeeRepo;
import com.example.employee.project.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeService {

    @Autowired
    employeeRepo employeerepo;

    public List<employee> allemployee() {
        return employeerepo.findAll();
    }

    public String updatedetails(String eName, int eSalary, int eId, String eWorkStatus) {
        employee emp = new employee( eName , eSalary,eId,eWorkStatus);
        employeerepo.save(emp);
        return eName+" completed";
    }

    public String updatedetailss(int eRollno, String eName, int eSalary, int eId, String eWorkStatus) {
        employee emp = new employee( eName , eSalary,eId,eWorkStatus);
        employeerepo.save(emp);
        return eName+" completed";
    }
}
