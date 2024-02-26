package com.example.demo.resource;

import com.example.demo.model.StudentModel;
import com.example.demo.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/Student")
public class student {
  @Autowired
  private studentService studentservice = new studentService();
  
  @GetMapping("/GetStudentById/{id}")
  public StudentModel GetStudentById(@PathVariable String id) throws Exception {
    return studentservice.GetStudentById(id);
  }
  
  @PostMapping("/AddStudent/{name}/{age}/{adhar}/{university}")
  public String AddStudent(@PathVariable String name, @PathVariable String age,@PathVariable String adhar, @PathVariable String university) {
    return studentservice.AddStudent(name,age,adhar,university);
  }
  
  @GetMapping("/GetAllStudentByUniversity/{university}")
  public ArrayList GetAllStudentByUniversity(@PathVariable String university) throws Exception {
    return studentservice.GetAllStudentByUniversity(university);
  }
}
