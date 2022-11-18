package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Student student1=new Student("Sai Kumar","Goruva","abc@gmail.com");
		//studentRepository.save(student1);
		
		//Student student2=new Student("Kalyan","Banavath","xyz@gmail.com");
		//studentRepository.save(student2);
		
		//Student student3=new Student("Suresh","Madaka","mno@gmail.com");
		//studentRepository.save(student3);

		
	}

}
