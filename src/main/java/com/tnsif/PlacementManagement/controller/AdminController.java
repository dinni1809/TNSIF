package com.tnsif.PlacementManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.tnsif.PlacementManagement.entity.Admin;
import com.tnsif.PlacementManagement.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;

	// Save Admin
	@PostMapping("/saveAdmin")
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin) {
		Admin savedAdmin = adminService.saveAdmin(admin);
		return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);
	}

	// Get All Admins
	@GetMapping("/getAdmins")
	public ResponseEntity<List<Admin>> getAdmins() {
		return ResponseEntity.ok(adminService.getAdmins());
	}

	// Update Admin
	@PutMapping("/updateAdmin")
	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) {
		return ResponseEntity.ok(adminService.updateAdmin(admin));
	}

	// Delete Admin
	@DeleteMapping("/deleteAdmin/{id}")
	public ResponseEntity<String> deleteAdmin(@PathVariable int id) {
		adminService.deleteAdmin(id);
		return ResponseEntity.ok("Admin deleted successfully!");
	}
}