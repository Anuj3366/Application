package com.example.demo.repository;

import com.example.demo.model.StudentModel;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Studentrepository {
  private Map<String, StudentModel> StudentMap;
  public Studentrepository(){
    StudentMap = new HashMap<>();
  }
  public void addStudent(String name, String age, String adhar, String university){
    StudentMap.put(name,new StudentModel(name,age,adhar,university));
  }
  public StudentModel GetStudentById(String name){
    return StudentMap.get(name);
  }
  pubic ArrayList GetAllStudentByUniversity(String University){
    ArrayList<StudentModel> al = new ArrayList<>();
    for(StudentModel student : StudentMap){
      if(student.getUniversity() == University){
        al.add(student);
      }
    }
    return al;
  }
}
