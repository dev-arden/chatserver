package com.websocket.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.websocket.chat.model.Account;
import com.websocket.chat.service.AccountService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AccountController {	
	private final AccountService accountService;

	@GetMapping("/members")
	public String members(Model model) {
		return "account/signup";
	}
	
	@PostMapping("/members")
	@ResponseBody
	public void addUser(@RequestParam String id, @RequestParam String password) {
		Account account = new Account();
		account.setId(id);
		account.setPassword(password);
		accountService.save(account, "ROLE_USER");
	}

	@GetMapping("/sessions")
	public String session(Model model) {
		return "/account/login";
	}
	
	@PostMapping("/sessions")
	public String login(@RequestParam String id, @RequestParam String password) {
		if(accountService.login(id, password) == 1){
			return "/chat/room";
		} else {
			return "/account/login";
		}
	}
}