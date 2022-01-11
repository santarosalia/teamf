package kr.co.confirm.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ConfirmDao {
	@Autowired
	private SqlSessionTemplate sqlsession;
	
}
