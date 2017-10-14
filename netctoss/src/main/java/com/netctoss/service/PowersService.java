package com.netctoss.service;

import java.util.List;

import com.netctoss.entity.Powers;

public interface PowersService {
	/**
	 * 获取所有权限
	 * @param powers
	 * @return
	 */
	public List<Powers> getAllPowers();
}
