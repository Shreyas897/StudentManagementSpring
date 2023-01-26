package com.ss.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/add_Student")
    public ResponseEntity add_Student(@RequestBody Student student){
       return new ResponseEntity(studentService.add_Student(student), HttpStatus.CREATED);
    }
    @GetMapping("/get_Student")
    public ResponseEntity get_Student(@RequestParam("q") int id){
        return new ResponseEntity(studentService.get_Student(id),HttpStatus.FOUND);
    }
    @PutMapping("/up_Student")
    public ResponseEntity update_Student(@RequestParam("id") int id,@RequestParam("age") int age){

        String Res=studentService.update_Student(id,age);
        if(Res==null)
            return new ResponseEntity("Invalid ID",HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(Res,HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete_Student/{id}")
    public ResponseEntity deleteStudent(@PathVariable("id") int id){
        String Res=studentService.deleteStudent(id);

        if(Res==null)
            return new ResponseEntity("Invalid ID",HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(Res,HttpStatus.ACCEPTED);
    }
}
