package com.vb.cdprojects.rest.controller;

import com.sun.javaws.progress.PreloaderPostEventListener;
import com.vb.cdprojects.data.entity.Student;
import com.vb.cdprojects.data.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/user/v1"})
public class StudentController {
    @Autowired
    private IStudentService iStudentService;

    /**
     * SAVE
     */
    @PostMapping(value = {"/post"})
    public ResponseEntity<Student> save(@RequestBody Student student) {
        student = iStudentService.save(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    /**
     * Retrieve
     */
    @PutMapping(value = {"put"})
    public ResponseEntity<Student> update(@RequestBody Student student) {
        student = iStudentService.save(student);
        return ResponseEntity.ok(student);
    }

    /**
     * Delete
     */
    @DeleteMapping(value = {"/delete"})
    public ResponseEntity<Void> delete(@RequestParam("studentId") Long studentId) {
        iStudentService.delete(studentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Retrieve
     */
    @GetMapping(value = {"/get"})
    public ResponseEntity<Student> getStudent(@RequestParam("studentId") Long studentId) {
        Student student = iStudentService.getStudent(studentId);
        return ResponseEntity.ok(student);
    }

    @GetMapping(value = {"/getAll"})
    public ResponseEntity<List<Student>> getAll() {
        List<Student> list = iStudentService.getAll();
        return ResponseEntity.ok(list);
    }
}
