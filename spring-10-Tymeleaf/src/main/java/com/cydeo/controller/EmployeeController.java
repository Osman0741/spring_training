package com.cydeo.controller;

import com.cydeo.model.Employee;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String employeeInfo(Model model){

        List<String> timeList = new ArrayList<>(Arrays.asList("Full Time","Part Time","None Time"));
        model.addAttribute("timeList",timeList);

        model.addAttribute("employee", new Employee());


        return "employee/employee-register";
    }
    @PostMapping("/confirm")
    public String submit(@ModelAttribute("employee") Employee employee, Model model){
       // model.addAttribute("employee",new Employee());
        return "redirect:/employee/register";
    }
}
