package com.springboot.controller;

import com.springboot.dao.EmployeeDao;
import com.springboot.entities.Employee;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController
{
    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/user/employee")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("employees",employees);
        return "list";
    }
}
