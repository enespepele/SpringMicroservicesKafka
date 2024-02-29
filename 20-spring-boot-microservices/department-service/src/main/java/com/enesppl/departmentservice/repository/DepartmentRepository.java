package com.enesppl.departmentservice.repository;

import com.enesppl.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {


    Department findByDepartmentCode(String departmentCode);


}