package com.tnsif.PlacementManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.PlacementManagement.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}