package com.args.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.args.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
}
