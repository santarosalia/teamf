package kr.co.confirm.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.confirm.model.dao.ConfirmDao;
import kr.co.voc.model.vo.Voc;

@Service
public class ConfirmService {
	@Autowired
	private ConfirmDao dao;

	public int allConfirm() {
		
		int result = dao.allConfirm();
		return result;
	}

	public int updateObject(int vocNo, int x) {
		int result = dao.updateObject(vocNo,x);
		return result;
	}

	public ArrayList<Voc> confirmList() {
		ArrayList<Voc> list = dao.confirmList();
		return list;
	}

	
}
