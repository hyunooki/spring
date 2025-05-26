package com.yedam.web.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TimeDAOImpl implements TimeDAO{
	
	@Autowired SqlSessionFactory sqlSession;
	
	@Override
	public String getTime() {
		return sqlSession.openSession().selectOne("com.yedam.web.mapper.TimeMapper.getTime2");
	}
}
