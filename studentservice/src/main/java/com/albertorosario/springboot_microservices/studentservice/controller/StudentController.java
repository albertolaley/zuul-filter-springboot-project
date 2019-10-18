package com.albertorosario.springboot_microservices.studentservice.controller;

import com.albertorosario.springboot_microservices.studentservice.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class StudentController {

  @RequestMapping(value = "/echoStudentName/{name}")
  public String echoStudentName(@PathVariable(name = "name") String name) {
    return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
  }

  @RequestMapping(value = "/getStudentDetails/{name}")
  public Student getStudentDetails(@PathVariable(name = "name") String name) {
    return new Student(name, "Vista Hermosa", "2 Level MCA");
  }
}
