package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.Account;
import service.AccountService;
import service.CategoryService;

@Controller
@RequestMapping(value = "account")
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		modelMap.put("msgListAccount", accountService.getAll());
		return "list-account";
	}
	
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String insert(ModelMap modelMap) {
		modelMap.put("msgListCategory", categoryService.getAll());		
		return "insert-account";
	}
	
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute Account account) {
		return "";	
	}
	
}
