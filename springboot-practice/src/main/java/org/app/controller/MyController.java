package org.app.controller;

import java.util.List;

import org.app.entity.Course;
import org.app.service.courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
private courseservice Courseservice;
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	//get the courses
	
	@GetMapping("/courses")
     public List<Course> getCourses()
	{
		
		return this.Courseservice.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.Courseservice	.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.Courseservice.addCourse(course);
		
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.Courseservice.updateCourse(course);
		
	}
	
	@DeleteMapping("/courses")
	public Course deleteCourse(@RequestBody Course course)
	{
		return this.Courseservice.deleteCourse(course);
		
	}
}
