package com.example.demo.serviceI;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
@Service
public class StudentServiceImpl implements StudentServiceI{

	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById() {
		// TODO Auto-generated method stub
		return null;
	}

}
