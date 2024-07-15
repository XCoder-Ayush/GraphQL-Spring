package com.graphql.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphql.test.dao.CourseDao;
import com.graphql.test.models.Course;


@Service
public class CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
//	public List<Course> getCourses(){
//		return this.courseDao.getCourses();
//	}
//
//	public Course postCourses(Course course) {
//		// TODO Auto-generated method stub
//		this.courseDao.postCourses(course);
//		return course;
//	}
	
	public List<Course> getCourses(){
		return this.courseDao.findAll();
	}

	public Course postCourses(Course course) {
		// TODO Auto-generated method stub
		this.courseDao.save(course);
		return course;
	}
}
