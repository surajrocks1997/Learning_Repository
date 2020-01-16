package com.spring.Course_API_DemoSpringBoot.Course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.spring.Course_API_DemoSpringBoot.Topic.Topic;

public interface CourseRepo extends JpaRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);
}
