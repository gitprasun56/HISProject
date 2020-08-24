package com.prasun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasun.entity.AdminEntity;
import com.prasun.repository.AdminRepository;

@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private AdminRepository repo;
	@Override
	public Integer saveAdmin(AdminEntity adminEntity) {
		Integer id=repo.save(adminEntity).getAdminId();
		return id;
	}

	@Override
	public List<AdminEntity> getAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAdmin(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public AdminEntity getOneAdmin(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAdmin(AdminEntity product) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isExist(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
