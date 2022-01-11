package kr.co.voc.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.voc.model.service.VocService;
import kr.co.voc.model.vo.Voc;

@Controller
public class VocController {
@Autowired
private VocService service;

@RequestMapping(value="/vocList.do")
public String vocList(Model model) {
	ArrayList<Voc> list = service.vocList();
	model.addAttribute("list",list);
	
	return "voc/vocList";
}
@RequestMapping(value="/vocWriteFrm.do")
public String vocWriteFrm() {
	
	return "voc/vocWrite";
}

@RequestMapping(value="/vocWrite.do")
public String vocWrite(int claimNo,String vocWho,String vocContent,String vocPenalty) {
	Voc voc = new Voc();
	voc.setClaimNo(claimNo);
	voc.setVocWho(vocWho);
	voc.setVocContent(vocContent);
	voc.setVocPenalty(vocPenalty);
	
	int result = service.vocWrite(voc);
	return "redirect:/vocList.do";
}
@RequestMapping(value="/insertPenalty.do")
public String insertPenalty(String vocWho,int vocNo) {
	Voc voc = new Voc();
	voc.setVocNo(vocNo);
	voc.setVocWho(vocWho);
	
	
	int result = service.penaltyInsert(voc);
	return "redirect:/vocList.do";
}

	
}
