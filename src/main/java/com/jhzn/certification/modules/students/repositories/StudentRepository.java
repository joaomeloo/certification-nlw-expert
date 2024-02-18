package com.jhzn.certification.modules.students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

import com.jhzn.certification.modules.students.entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, UUID>{

    public Optional<StudentEntity> findByEmail(String email);
    
}
