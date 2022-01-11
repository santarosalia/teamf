package kr.co.confirm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.confirm.model.service.ConfirmService;

@Controller
public class ConfirmController {
	@Autowired
	private ConfirmService service;
	
	
}
