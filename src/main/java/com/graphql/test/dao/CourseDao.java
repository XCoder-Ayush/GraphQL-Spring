package com.graphql.test.dao;
import java.util.*;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.test.models.*;

//@Repository
//@Configuration
//public class CourseDao{
//	
//	List<Course> coursesList;
//	
//	public CourseDao() {
//		coursesList=new ArrayList<>();
//		Course course1=new Course();
//		course1.setName("Java");
//		course1.setId(1);
//		course1.setDuration(100);
//		
//		Course course2=new Course();
//		course2.setName("Spring Boot");
//		course2.setId(2);
//		course2.setDuration(200);
//
//		Course course3=new Course();
//		course3.setName("Angular");
//		course3.setId(3);
//		course3.setDuration(300);
//		
//		coursesList.add(course1);
//		coursesList.add(course2);
//		coursesList.add(course3);		
//	}
//	
//	public List<Course> getCourses(){
//		return this.coursesList;
//	}
//
//	public Course postCourses(Course course) {
//		// TODO Auto-generated method stub
//		this.coursesList.add(course);
//		return course;
//
//	}
//}


@Repository
public interface CourseDao extends JpaRepository<Course,Integer> {
	
}