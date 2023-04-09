package org.app.service;

import java.util.ArrayList;
import java.util.List;

import org.app.entity.Course;
import org.springframework.stereotype.Service;


@Service
public class Courseserviceimpl implements courseservice{
	
	
	
	
	List<Course> list;
	
	public Courseserviceimpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"java course","this course basic of java"));
		list.add(new Course(122,"php","this is basics"));
		
	}

	@Override
	public List<Course>  getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(Long courseId) {
		
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	@Override
	public Course deleteCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}
	
	
	
}
