package com.sawan.spring.springmvcorm.users.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sawan.spring.springmvcorm.users.dao.UsersDao;
import com.sawan.spring.springmvcorm.users.entity.Users;

@Repository
public class UsersDaoImpl implements UsersDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(Users users) {
		Integer result = (Integer) hibernateTemplate.save(users);
		return result;
	}

	@Override
	public List<Users> getAllUsers() {
		return hibernateTemplate.loadAll(Users.class);
	}

	@Override
	public Users findUsers(Integer id) {
		return hibernateTemplate.get(Users.class, id);
	}

}