package com.example.jpa.jpademo;

//Spring Boot Tutorials 
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.jpa.jpademo.dao.EmplRepo;

@Controller
public class HomeController {
	@Autowired
	EmplRepo repo;
	
	@RequestMapping("/home")
	public String home(Employee emp){
		
		return "home";
	}
	
	@PostMapping("/addEmp")
	@ResponseBody
	public Employee addEmp(@RequestBody Employee emp){
		repo.save(emp);
		return emp;
	}
	

	@PutMapping("/updateEmp")
	@ResponseBody
	public Employee updateEmp(@RequestBody Employee emp){
		repo.save(emp);
		return emp;
	}
	
	@DeleteMapping("/deleteEmp/{eid}")
	@ResponseBody
	public String deleteEmp(@PathVariable("eid") int eid){
		Employee e=repo.getOne(eid);
		repo.delete(e);
		return "deleted";
	}
	
	@RequestMapping(path="/getEmp",produces={"application/json"})
	@ResponseBody
	public List<Employee> getEmps(){
		return repo.findAll();
	} 
	
	@RequestMapping("/getEmp/{eid}")
	@ResponseBody
	public Optional<Employee> getEmp(@PathVariable("eid") int eid){
		
		return repo.findById(eid);
	} 
}
