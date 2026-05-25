package jp.co.sss.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.crud.entity.Employee;
import jp.co.sss.crud.repository.EmployeeRepository;

@Controller
public class ListController {

	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String showList(Model model) {

		List<Employee> employeeList = employeeRepository.findAll();

		model.addAttribute("employees", employeeList);

		return "list/list";
	}
	
	

	@RequestMapping(path = "/list/empName", method = RequestMethod.GET)
	public String search(String empName, Model model) {

		List<Employee> employeeList = employeeRepository.findByEmpNameContaining(empName);

		model.addAttribute("employees", employeeList);
		
		if (employeeList.isEmpty()) {
			model.addAttribute("message", "該当する社員は存在しません。");
		}

		return "list/list";
	}
}
