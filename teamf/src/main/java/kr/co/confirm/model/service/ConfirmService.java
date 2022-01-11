package kr.co.confirm.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.confirm.model.dao.ConfirmDao;

@Service
public class ConfirmService {
	@Autowired
	private ConfirmDao dao;
}
