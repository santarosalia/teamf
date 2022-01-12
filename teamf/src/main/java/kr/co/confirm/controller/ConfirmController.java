package kr.co.confirm.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.confirm.model.service.ConfirmService;
import kr.co.voc.model.vo.Voc;

@Controller
public class ConfirmController {
	@Autowired
	private ConfirmService service;
	
	@RequestMapping(value="confirmList.do")
	public String confirmList(Model model) {
		int result =service.allConfirm();
		ArrayList<Voc> list = service.confirmList();
		model.addAttribute("list",list);
		return "confirm/confirmList";
	}
	
	@RequestMapping(value="updateObject.do")
	public String updateObject(int vocNo,int x) {
		
		int result =service.updateObject(vocNo,x);
		return "redirect:confirmList.do";
	}
}
