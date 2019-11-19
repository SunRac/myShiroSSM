package com.myshiro.mapper;

import com.myshiro.pojo.Role;

import java.util.List;


public interface RoleMapper {
	public List<Role> listRolesByUserName(String userName);
	
}
