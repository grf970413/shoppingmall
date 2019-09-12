package com.cxf.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cxf.dao.ShopcartDao;
import com.cxf.pojo.Shopcart;
import com.cxf.service.ShopcartService;

@Service("shopcartServiceImpl")
public class ShopcartServiceImpl implements ShopcartService {
	
	@Resource(name="shopcartDaoImpl")
	private ShopcartDao shopcartDao;
	
	/**
	  *   获取购物车列表
	 * @param
	 * @return
	 */
	@Override
	public List<Shopcart> getShopcartByUserName(String userName) {
		return shopcartDao.getShopcartByUserName(userName);
	}

	/**
	 *
	 * @param
	 * @return
	 */
	@Override
	public List<Shopcart> getShopcartByUserId(Integer userId) {
		return shopcartDao.getShopcartByUserId(userId);
	}

	/**
	 * 
	 * @param map()
	 * @return
	 */
	@Override
	public Shopcart findShopcartByUserName(Map<Object, Object> map) {
		return shopcartDao.findShopcartByUserName(map);
	}

	@Override
	public void deteleShopcart(Shopcart shopcart) {
		shopcartDao.deteleShopcart(shopcart);
	}

	@Override
	public void addShopcart(Shopcart shopcart) {
		shopcartDao.addShopcart(shopcart);
	}

	@Override
	public void updateShopcart(Shopcart shopcart) {
		shopcartDao.updateShopcart(shopcart);
	}
}
