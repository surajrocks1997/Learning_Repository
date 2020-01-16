package com.spring.Course_API_DemoSpringBoot.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepo courseRepo;
	
	/*
	 * List<Course> topics = new ArrayList<Course>(Arrays.asList( new
	 * Course("spring", "spring framework", "spring framework description"), new
	 * Course("java", "core java", "core java description"), new
	 * Course("javascript", "javascript", "Javascript description") ));
	 */
	
	public List<Course> getAllCourses(String topicId){
//		return topics;
		List<Course> courses = new ArrayList<Course>();
		courseRepo.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
//		return topics.stream().filter
//				(t -> t.getId().equals(id)).findAny().get();
		return courseRepo.findById(id).orElse(new Course());
		
	}

	public void addCourse(Course course) {
		courseRepo.save(course);
	}

	public void updateCourse(String id, Course course) {
//		for (int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		courseRepo.save(course);
	}
	
	public void deleteCourse(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		courseRepo.deleteById(id);
	}
}
