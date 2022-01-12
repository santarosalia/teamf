package kr.co.rep.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.voc.model.vo.Voc;

@Repository
public class RepDao {
	@Autowired
	private SqlSessionTemplate sqlsession;

	public ArrayList<Voc> repList() {
		List list = sqlsession.selectList("rep.repList");
		return (ArrayList<Voc>)list;
	}

	public int repWrite(int vocNo) {
		int result = sqlsession.insert("rep.repWrite",vocNo);
		return result;
	}
	
}
