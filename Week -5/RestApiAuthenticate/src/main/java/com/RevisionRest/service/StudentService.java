package com.RevisionRest.service;

import com.RevisionRest.model.Student;
import com.RevisionRest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    public Student addStudent(Student student){
        return repository.save(student);
    }
    public List<Student> getAllStudents(){
        return repository.findAll();
    }
    public Student getStudentById(Integer id){
        return repository.findById(id).orElse(null);
    }
    public Student updateStudent(Student student){
        return repository.save(student);
    }
    public void deleteById(Integer id){
        repository.deleteById(id);
    }

}
