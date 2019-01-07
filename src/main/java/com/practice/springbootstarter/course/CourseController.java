package com.practice.springbootstarter.course;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springbootstarter.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	

	@RequestMapping("topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable("topicId") String topicId) {
		
		return service.getAllCourses(topicId);
		
		
	}
	
	@RequestMapping("topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable("id") String id) {
		
		return service.getCourse(id);
		
		
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course,@PathVariable("topicId") String topicId) {
		
		course.setTopic(new Topic(topicId,"", ""));
		
		 service.addCourse(course);
		
		
	}
	
	

	@RequestMapping(method=RequestMethod.PUT,value="topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable("id") String id,@PathVariable("topicId") String topicId) {
		course.setTopic(new Topic(topicId,"", ""));
		 service.updateCourse(id, course);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable("id") String id) {
		
		 service.deleteCourse(id);
		
		
	}
		
	
	
}
