package com.mybox.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybox.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
