package com.main;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DoctorController
{
    
	@GetMapping("/wish")
	public ResponseEntity<String> getWish()
	{
		return new ResponseEntity<String>("Good Morning",HttpStatus.OK);
	}
	@GetMapping("/wish/{name}")
	public ResponseEntity<String> getWish(@PathVariable String name)
	{
		return new ResponseEntity<String>("Good Morning-"+name,HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Doctor> register(@RequestBody Doctor doctor)
	{
		
		return new ResponseEntity<Doctor>(doctor, HttpStatus.CREATED);
	}
	@GetMapping("/getDoctor")
	public ResponseEntity<Doctor> getDoctor()
	{
		  Doctor d = new Doctor();
		  d.setId(10001);d.setDocName("Banalaxmi");d.setIncome(6000f);
		
		return new ResponseEntity<Doctor>(d,HttpStatus.OK);
	}
	
	@GetMapping("/getAllDoctors")
	public ResponseEntity<List<Doctor>> getAllDoctors()
	{
	     Doctor d1 = new Doctor();
	       d1.setId(3001);d1.setDocName("Raja");d1.setIncome(35000f);
	     
	     Doctor d2 = new Doctor();
	     d2.setId(3002);d2.setDocName("Jaga");d2.setIncome(65000f);
	     
	     Doctor d3 = new Doctor();
	     d3.setId(3003);d3.setDocName("Anshika");d3.setIncome(75000f);
	     
	     Doctor d4 = new Doctor();
	     d4.setId(3004);d4.setDocName("Laxmi");d4.setIncome(20000f);
	     List<Doctor> list = List.of(d1,d2,d3,d4);
	     
	     return new ResponseEntity<List<Doctor>>(list,HttpStatus.OK);
	}
}
