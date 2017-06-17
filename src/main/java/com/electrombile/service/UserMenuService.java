package com.electrombile.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electrombile.dao.UserMenuDao;
import com.electrombile.model.UserMenu;

@Service
@Transactional
public class UserMenuService {
	
	@Autowired
	private UserMenuDao userMenuDao;
	
	public List<UserMenu> queryListByUser(Integer id){
		return userMenuDao.queryListByUserId(id);
	}
	
	public int addUserMenus(List<UserMenu> menus){
		int num = 0;
		if (null != menus && menus.size() > 0) {
			for (UserMenu menu:menus) {
				num = userMenuDao.insertUserMenu(menu);
			}
		}
		return num;
	}
	
	public List<String> queryCheckMenuByUserId(Integer id){
		List<UserMenu> menus = userMenuDao.queryCheckMenuByUserId(id);
		List<String> strs = null;
		if (null != menus && menus.size() > 0) {
			strs = new ArrayList<String>();
			for (UserMenu menu:menus) {
				strs.add(menu.getMenuUrl().trim());
			}
		}
		return strs;
	}
	
	public List<String> queryListByUserId(Integer id){
		List<UserMenu> menus = userMenuDao.queryListByUserId(id);
		List<String> strs = null;
		if (null != menus && menus.size() > 0) {
			strs = new ArrayList<String>();
			for (UserMenu menu:menus) {
				strs.add(menu.getMenuUrl().trim());
			}
		}
		return strs;
	}
	
	public List queryMenuListByUser(Integer id){
		List<UserMenu> menus = userMenuDao.queryListByUserId(id);
		List list = null;
		StringBuffer str = new StringBuffer();
		if (null != menus && menus.size() > 0) {
			list = new ArrayList<>();
			for (UserMenu menu:menus) {
				list.add(menu.getMenuId());
			}
		}
		return list;
	}
	
	public int deleteUserMenuByUserId(Integer id){
		return userMenuDao.deleteUserMenu(id);
	}
}
