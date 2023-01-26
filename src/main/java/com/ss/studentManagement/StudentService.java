package com.ss.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service



public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String add_Student(Student student){
        return studentRepository.add_Student(student);
    }
    public Student get_Student(int id){
        return studentRepository.get_Student(id);
    }
    public String update_Student(int id,int age){
        return studentRepository.update_Student(id,age);
    }
    public String deleteStudent(int id){
        return studentRepository.deleteStudent(id);
    }

}
