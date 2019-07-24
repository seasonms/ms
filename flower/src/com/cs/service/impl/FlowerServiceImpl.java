package com.cs.service.impl;

import java.util.List;

import com.cs.dao.FlowerDao;
import com.cs.dao.impl.FlowerDaoImpl;
import com.cs.pojo.Flower;
import com.cs.service.FlowerService;

public class FlowerServiceImpl implements FlowerService{
 
	private FlowerDao flowerdao = new FlowerDaoImpl();
	@Override
	public List<Flower> show() {
		List<Flower> list = flowerdao.selAll();
		return list;
	}

}
