package com.spring.Course_API_DemoSpringBoot.Topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepo extends JpaRepository<Topic, String> {

}
