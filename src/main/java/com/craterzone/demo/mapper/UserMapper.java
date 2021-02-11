package com.craterzone.demo.mapper;




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
	
	public static AddressDao AddressToAddressDao(User user) {
		AddressDao addressDao = new AddressDao();
		BeanUtils.copyProperties(user, addressDao);
		return addressDao;	
	}
	public static Address AddressDaoToAddress(UserDao userdao) {
		Address address = new Address();
		BeanUtils.copyProperties(userdao, address);
		return address;
		
	}
		public static UserDao UserToUserDao(User user) {
			UserDao userdao = new UserDao();
	BeanUtils.copyProperties(user, userdao); 
		return  userdao;
		}
}
