package com.spring.Course_API_DemoSpringBoot.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.spring.Course_API_DemoSpringBoot.Topic.Topic;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;
	
	//how do you tell spring that it is basically foreign key to primary key on topic table, @?
	@ManyToOne
	private Topic topic;
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	//no argument constructor
	public Course() {
	}
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}
}
