package com.vb.cdprojects.data.service;

import com.vb.cdprojects.data.entity.Student;

import java.util.List;

public interface IStudentService {
    public Student save(Student student);
    public Student update(Student student);
    public void delete(Student student);
    public void delete(Long studentId);
    public Student getStudent(Long studentId);
    public List<Student> getAll();
}
