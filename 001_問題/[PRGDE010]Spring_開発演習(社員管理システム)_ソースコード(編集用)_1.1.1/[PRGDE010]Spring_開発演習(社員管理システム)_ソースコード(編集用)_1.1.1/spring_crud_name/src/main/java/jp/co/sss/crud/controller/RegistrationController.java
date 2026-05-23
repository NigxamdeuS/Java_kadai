package jp.co.sss.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.crud.form.EmployeeForm;

@Controller
public class RegistrationController {

	@RequestMapping(path = "/regist/input", method = RequestMethod.GET)
	public String index( @ModelAttribute EmployeeForm employeeForm) {
		return "/regist/regist_input";
	}
}
