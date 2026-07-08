package com.tnsif.PlacementManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.PlacementManagement.entity.Admin;
import com.tnsif.PlacementManagement.repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Save Admin
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // Get All Admins
    public List<Admin> getAdmins() {
        return adminRepository.findAll();
    }

    // Update Admin
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // Delete Admin
    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }
}