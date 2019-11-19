package com.myshiro.service.impl;

import com.myshiro.mapper.RoleMapper;
import com.myshiro.pojo.Role;
import com.myshiro.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
public class RoleServiceImpl  implements RoleService {

	@Autowired
	RoleMapper roleMapper;

	@Override
	public Set<String> listRoles(String userName) {
		List<Role> roles = roleMapper.listRolesByUserName(userName);
		Set<String> result = new HashSet<>();
		for (Role role: roles) {
			result.add(role.getName());
		}
		return result;
	}
}
