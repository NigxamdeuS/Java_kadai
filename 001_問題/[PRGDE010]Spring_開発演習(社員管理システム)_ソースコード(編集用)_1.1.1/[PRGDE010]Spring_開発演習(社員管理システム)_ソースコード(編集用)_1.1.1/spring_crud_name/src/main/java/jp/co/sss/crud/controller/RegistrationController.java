package jp.co.sss.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.crud.entity.Department;
import jp.co.sss.crud.entity.Employee;
import jp.co.sss.crud.form.EmployeeForm;
import jp.co.sss.crud.repository.EmployeeRepository;

@Controller
public class RegistrationController {

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(path = "/regist/input", method = RequestMethod.GET)
    public String index(@ModelAttribute EmployeeForm employeeForm) {
        return "regist/regist_input";
    }

    @RequestMapping(path = "/regist/check", method = RequestMethod.POST)
    public String check(
            @Validated @ModelAttribute EmployeeForm employeeForm,
            BindingResult result) {
    	
        if (result.hasErrors()) {
            return "regist/regist_input";
        }

        return "regist/regist_check";
    }

    @RequestMapping(path = "/regist/input", method = RequestMethod.POST)
    public String back(@ModelAttribute EmployeeForm employeeForm) {
        return "regist/regist_input";
    }

    @RequestMapping(path = "/regist/complete", method = RequestMethod.POST)
    public String complete(@ModelAttribute EmployeeForm employeeForm) {

        Employee employee = new Employee();
        
        Department department = new Department();

        employee.setEmpPass(employeeForm.getEmpPass());
        employee.setEmpName(employeeForm.getEmpName());
        employee.setGender(employeeForm.getGender());
        employee.setAddress(employeeForm.getAddress());
        employee.setBirthday(employeeForm.getBirthday());
        employee.setAuthority(employeeForm.getAuthority());

        department.setDeptId(employeeForm.getDeptId());
        employee.setDepartment(department);

        employeeRepository.save(employee);

        return "regist/regist_complete";
    }
}