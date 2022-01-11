package kr.co.voc.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.voc.model.dao.VocDao;
import kr.co.voc.model.vo.Voc;

@Service
public class VocService {
@Autowired
private VocDao dao;

public ArrayList<Voc> vocList() {
	ArrayList<Voc> list = dao.vocList();
	return list;
}

public int vocWrite(Voc voc) {
	int result = dao.selectVoc(voc);
	int result1 = dao.insertVoc(voc);
	
	if(result ==1) {
		result1 = dao.select();
		result1 = dao.insertRep(result1);
	}
	return result1;
}

public int penaltyInsert(Voc voc) {
	int result = dao.penaltyInsert(voc);
	
	return result;
}



}
