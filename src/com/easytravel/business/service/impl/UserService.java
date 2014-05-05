package com.easytravel.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.easytravel.business.bean.User;
import com.easytravel.business.dao.IUserDao;
import com.easytravel.business.service.IUserService;
import com.easytravel.core.persistence.IGenericDao;
import com.easytravel.core.service.impl.GenericService;


/** 
 * 类说明 :用户Service
 * @author  joker 
 * 创建时间：2013-2-19 上午11:12:41 
 */
public class UserService extends GenericService<User, String> implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	protected IGenericDao getDao() {
		// TODO Auto-generated method stub
		return userDao;
	}

}
