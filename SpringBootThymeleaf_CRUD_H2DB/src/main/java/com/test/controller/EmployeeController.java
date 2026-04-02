package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.test.entity.Employee;
import com.test.repository.EmployeeRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/employees/")
public class EmployeeController {

    private final EmployeeRepository employeerepository;

    public EmployeeController(EmployeeRepository employeerepository) {
        this.employeerepository = employeerepository;
    }

    // Show Add Employee form
    @GetMapping("signup")
    public String showSignUpForm(Employee employee) {
        return "add-employee";
    }

    // List all employees
    @GetMapping("list")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeerepository.findAll());
        return "index1";
    }

    // Add new employee
    @PostMapping("add")
    public String addEmployee(@Valid Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-employee";
        }
        employeerepository.save(employee);
        return "redirect:/employees/list";
    }

    // Show update form
    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Employee employee = employeerepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee Id:" + id));
        model.addAttribute("employee", employee);
        return "update-employee";
    }

    // Update employee
    @PostMapping("update/{id}")
    public String updateEmployee(@PathVariable("id") long id, @Valid Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            employee.setId(id); // retain ID if validation fails
            return "update-employee";
        }
        employeerepository.save(employee);
        return "redirect:/employees/list";
    }

    // Delete employee (triggered from update page)
    @GetMapping("delete/{id}")
    public String deleteEmployee(@PathVariable("id") long id) {
        Employee employee = employeerepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee Id:" + id));
        employeerepository.delete(employee);
        return "redirect:/employees/list";
    }
}
