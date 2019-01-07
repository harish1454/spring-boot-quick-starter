package com.practice.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	//List<Course> topicList =  new ArrayList<>(Arrays.asList(new Course("1", "java", "java 8"),new Course("2", "java", "java 6")));
	
public List<Course> getAllCourses(String topicId) {
	
	List<Course> courseList = new ArrayList<Course>();
		
	 courseRepository.findAll().forEach(courseList::add);
	return courseList;
		
		//return topicList;
		
	}

public Course getCourse(String id) {
	
	return courseRepository.findOne(id);
	
}

public void addCourse(Course topic) {
	
	//topicList.add(topic);
	courseRepository.save(topic);
}

public void updateCourse(String id, Course topic) {
//	for (int i = 0; i < topicList.size(); i++) {
//
//		Course t = topicList.get(i);
//		if(t .getId().equals(id))
//		{
//			topicList.set(i, topic);
//		}
//
//	}
	
	courseRepository.save(topic);

}

public void deleteCourse(String id) {
	
	//topicList.removeIf(t->t.getId().equals(id));
	
	courseRepository.delete(id);
	
}

}
