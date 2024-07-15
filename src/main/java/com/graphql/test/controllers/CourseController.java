package com.graphql.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.graphql.test.models.Course;
import com.graphql.test.services.CourseService;

@Controller
//@RequestMapping("/api")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
//	@GetMapping("/courses")
//	public List<Course> getCourses() {
//		return this.courseService.getCourses();
//	}
//	
//	@PostMapping("/courses")
//	public Course addCourses(@RequestBody Course course) {
//		return this.courseService.postCourses(course);
//		
//	}
	
	@QueryMapping("getCourses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}
}
