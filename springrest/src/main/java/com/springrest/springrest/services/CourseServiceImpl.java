package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	public CourseServiceImpl() {
		
		/*
		 * list= new ArrayList<>(); list.add(new Course(101, "Java Course",
		 * "This is best Course")); list.add(new Course(201, "React JS",
		 * "Best Course to learn FrontEnd")); list.add(new Course(301, "MYSQL",
		 * "Most Preferred Database"));
		 */
		
	}
	
	@Override
	public List<Course> getCourses() {
		
		//return list;
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
		
		/*
		 * Course c=null;
		 * 
		 * for(Course course:list) { if (course.getId()==courseId) { c= course; break; }
		 * }
		 * 
		 * return c ;
		 */	
		return courseDao.getById(courseId);
		}
	
	@Override
	public Course addCourse(Course course) {
		
		/*
		 * list.add(course); return course;
		 */	
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Course updateCourse(long courseId, Course updatedCourse) {
		
		/*
		 * for(Course course:list) { if(course.getId()==courseId) {
		 * course.setTitle(updatedCourse.getTitle());
		 * course.setDescription(updatedCourse.getDescription()); return course; }return null; }
		 */	
		
		courseDao.save(updatedCourse);
		return updatedCourse;
	}
	
	@Override
	public boolean deleteCourse(long courseId) {
		
		//return list.removeIf(course -> course.getId() == courseId);
		
		 courseDao.deleteById(courseId);
		return true;
	}
	
	
}
