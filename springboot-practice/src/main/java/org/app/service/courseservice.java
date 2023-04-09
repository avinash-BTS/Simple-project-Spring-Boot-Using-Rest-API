package org.app.service;

import java.util.List;

import org.app.entity.Course;

public interface courseservice {

	
	public List<Course> getCourses();
	 public Course getCourse(Long courseId);
	 public Course addCourse(Course course);
	 public Course updateCourse(Course course);
	 public Course deleteCourse(Course course);
}
