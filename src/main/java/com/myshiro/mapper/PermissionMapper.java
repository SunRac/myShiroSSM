package com.myshiro.mapper;

import com.myshiro.pojo.Permission;

import java.util.List;


public interface PermissionMapper {
	public List<Permission> listPermissionsByUserName(String userName);
	
}
