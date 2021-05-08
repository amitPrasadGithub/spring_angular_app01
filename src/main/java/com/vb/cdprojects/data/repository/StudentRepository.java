package com.vb.cdprojects.data.repository;

import com.vb.cdprojects.data.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
