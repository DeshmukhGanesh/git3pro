package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.serviceI.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;
	
	@PostMapping(value ="/addStudent",consumes = "application/json",produces = "application/json")
	public ResponseEntity<Integer> addStudent(@RequestBody Student student) {
		int addStudent = studentServiceI.addStudent(student);
		
		return new ResponseEntity<Integer>(addStudent,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value ="/getAllStudent",produces = "application/json")
	public ResponseEntity<List<Student>> getAllStudent(){
		
		List<Student> allStudent = studentServiceI.getAllStudent();
		return new ResponseEntity<List<Student>>(allStudent,HttpStatus.OK);	
	}
	
	
	public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
		
		Student studentById = studentServiceI.getStudentById(id);
		
		return new ResponseEntity<Student>(studentById,HttpStatus.OK);
		
	}
	
}
