package com.adarsha.account.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adarsha.account.Service.AccountService;
import com.adarsha.account.model.Account;

@RestController
@RequestMapping (path = "/account")
public class AccountController {

	@Autowired
	private AccountService service;
	
	@PostMapping (path = "/add" , consumes = "application/json", produces = "application/json")
	public Account addaccount(@RequestBody Account account)
	{
		return service.addacount(account);
	}
	
	@GetMapping(path = "/id/{custamerid}" , produces = "application/json")
	public Account findByCustamerid(@PathVariable long custamerid) {
		return service.findByCustamerid(custamerid);
	}
	
	
}
