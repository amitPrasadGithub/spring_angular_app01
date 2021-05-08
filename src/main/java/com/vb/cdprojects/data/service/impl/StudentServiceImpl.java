package com.vb.cdprojects.data.service.impl;

import com.vb.cdprojects.data.entity.Student;
import com.vb.cdprojects.data.repository.StudentRepository;
import com.vb.cdprojects.data.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public Student save(Student student) {
        student = repository.save(student);
        return student;
    }

    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public void delete(Student student) {
        repository.delete(student);
    }
    public void delete(Long studentId) {
        repository.deleteById(studentId);
    }

    @Override
    public Student getStudent(@RequestParam("studentId") Long studentId) {
        return repository.findById(studentId).get();
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }
}
