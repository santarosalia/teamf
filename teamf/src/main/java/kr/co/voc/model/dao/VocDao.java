package kr.co.voc.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.voc.model.vo.Voc;

@Repository
public class VocDao {
@Autowired
private SqlSessionTemplate sqlsession;

public ArrayList<Voc> vocList() {
	List list = sqlsession.selectList("voc.vocList");
	
	return (ArrayList<Voc>)list;
}

public int selectVoc(Voc voc) {
	int result = 0;
	
	Voc voc1 = sqlsession.selectOne("voc.selectOne",voc);
	
	if(voc1.getVocWho().equals(voc.getVocWho())) {
		
		//고객귀책
	}else {
		result = 1;
		//운송사귀책
	}
	return result;
}

public int insertVoc(Voc voc) {
	int result = sqlsession.insert("voc.insert",voc);
	
	return result;
}

public int insertRep(int vocNo) {
	int result = sqlsession.insert("voc.insertRep",vocNo);
	return result;
}

public int select() {
	Voc voc1 = sqlsession.selectOne("voc.select");
	int result = voc1.getVocNo();
	return result;
}

public int penaltyInsert(Voc voc) {
	int result = sqlsession.insert("voc.penaltyInsert",voc);
	return result;
}


}
