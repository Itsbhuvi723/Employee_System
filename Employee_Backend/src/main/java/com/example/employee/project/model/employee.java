package com.example.employee.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int e_rollno;

    private String e_name;
    private int e_salary;
    private int e_id ;
    private String e_work_status ;

    public void setE_rollno(int e_rollno) {
        this.e_rollno = e_rollno;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public void setE_salary(int e_salary) {
        this.e_salary = e_salary;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public void setE_work_status(String e_work_status) {
        this.e_work_status = e_work_status;
    }

    public employee(String e_name, int e_rollno, int e_salary, int e_id, String e_work_status) {
        this.e_name = e_name;
        this.e_rollno = e_rollno;
        this.e_salary = e_salary;
        this.e_id = e_id;
        this.e_work_status = e_work_status;
    }

    public employee(String e_name,int e_salary, int e_id, String e_work_status) {
        this.e_name = e_name;
        this.e_salary = e_salary;
        this.e_id = e_id;
        this.e_work_status = e_work_status;
    }

    public employee() {

    }
}
