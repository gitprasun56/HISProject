package com.prasun.service;

import java.util.List;

import com.prasun.entity.AdminEntity;

public interface IAdminService {
	
	// save product
		public Integer saveAdmin(AdminEntity adminEntity);
		// fetch all products
		public List<AdminEntity> getAllAdmins();
		// delete product by id
		public void deleteAdmin(Integer id);
		// fetch one product
		public AdminEntity getOneAdmin(Integer id);
		// update product
		public void updateAdmin(AdminEntity product);
		//is record exist by given id
		public boolean isExist(Integer id);
	  }


