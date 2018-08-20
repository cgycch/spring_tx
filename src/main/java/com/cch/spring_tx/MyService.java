package com.cch.spring_tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyService {
	
	@Autowired 
	UserDao dao;
	
	@Transactional
	public void doSome() {
		dao.listUsers();
	}
	
}
