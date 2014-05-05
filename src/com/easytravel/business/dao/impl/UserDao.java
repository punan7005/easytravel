package com.easytravel.business.dao.impl;

import com.easytravel.business.bean.User;
import com.easytravel.business.dao.IUserDao;
import com.easytravel.core.persistence.impl.IbatisGenericDao;

/** 
 * 类说明 :用户Dao
 * @author  joker 
 * 创建时间：2013-2-1 下午4:32:23 
 */
public class UserDao extends IbatisGenericDao<User, String> implements IUserDao{

}
