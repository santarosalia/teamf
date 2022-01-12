package kr.co.confirm.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.voc.model.vo.Voc;

@Repository
public class ConfirmDao {
	@Autowired
	private SqlSessionTemplate sqlsession;

	public int allConfirm() {
		int result = sqlsession.update("confirm.allConfirm");
		return result;
	}

	public int updateObject(int vocNo, int x) {
		int result=0;
		if(x==1) {
			result = sqlsession.update("confirm.noObject",vocNo);
		}else {
			result = sqlsession.update("confirm.yesObject",vocNo);
		}
		return result;
	}

	public ArrayList<Voc> confirmList() {
		List list = sqlsession.selectList("confirm.confirmList");
		return (ArrayList<Voc>)list;
	}

	
	
}
