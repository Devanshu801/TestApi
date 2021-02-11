package com.craterzone.demo.mapper;



import org.apache.commons.beanutils.PropertyUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;

import com.craterzone.demo.dao.AddressDao;
import com.craterzone.demo.dao.UserDao;
import com.craterzone.demo.model.Address;
import com.craterzone.demo.model.User;



public class UserMapper {
ModelMapper modelmappper = new ModelMapper();
	public static User UserDaoToUser(UserDao userdao) {
		User user = new User();
		BeanUtils.copyProperties(userdao, user);
		return  user;
	}
	
		public static UserDao UserToUserDao(User user) {
			UserDao userdao = new UserDao();
	BeanUtils.copyProperties(user, userdao);
		  
		return  userdao;
	
		}
}
