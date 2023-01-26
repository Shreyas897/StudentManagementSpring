package com.ss.studentManagement;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Repository

public class StudentRepository {
    Map<Integer,Student> hm= new HashMap<>();
    public String add_Student(Student student) {
        int id = student.getId();
        hm.put(id, student);
        return "Added Successfully";
    }
    public Student get_Student(int id){
        return hm.get(id);
    }
    public String update_Student(int id,int age){
        if(hm.get(id)==null)
            return null;
        hm.get(id).setAge(age);
        return "Update Successful";
    }

    public String deleteStudent(int id){
        if(hm.get(id)==null)
            return null;
        hm.remove(id);
        return "deleted successful";
    }
}
