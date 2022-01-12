package kr.co.rep.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rep.model.dao.RepDao;
import kr.co.voc.model.vo.Voc;

@Service
public class RepService {
	@Autowired
	private RepDao dao;

	public ArrayList<Voc> repList() {
		ArrayList<Voc> list = dao.repList();
		
		return list;
	}

	public int repWrite(int vocNo) {
		int result = dao.repWrite(vocNo);
		return result;
	}
	
}
