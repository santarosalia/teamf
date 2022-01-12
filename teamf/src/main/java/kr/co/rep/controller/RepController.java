package kr.co.rep.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.rep.model.service.RepService;
import kr.co.voc.model.vo.Voc;

@Controller
public class RepController {
	@Autowired
	private RepService service;
	
	@RequestMapping(value="repList.do")
	public String repList(Model model) {
		ArrayList<Voc> list = service.repList();
		model.addAttribute("list",list);
		return "rep/repList";
	}
	@RequestMapping(value="repWrite.do")
	public String repWrite(int vocNo) {
		int result = service.repWrite(vocNo);
		return "redirect:/repList.do";
	}
}
