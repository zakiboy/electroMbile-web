package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.UserMenu;

@Repository
public interface UserMenuDao {
	
	public int insertUserMenu(UserMenu userMenu);
	
	public int addUserMenus(List<UserMenu> menus);
	
	public int deleteUserMenu(Integer id);
	
	public int deleteUserMenuByUserId(Integer id);

	public int updateUserMenu(UserMenu userMenu);

	public UserMenu loadUserMenu(Integer id);
	
	public List<UserMenu> queryListByUserId(Integer id);
	
	public List<UserMenu> queryCheckMenuByUserId(Integer id);

	public List<UserMenu> queryList(UserMenu userMenu);

	public List<UserMenu> queryPageList(UserMenu userMenu);

	public int queryCount(UserMenu userMenu);

}
