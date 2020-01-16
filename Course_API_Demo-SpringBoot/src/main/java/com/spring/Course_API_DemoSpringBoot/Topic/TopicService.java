package com.spring.Course_API_DemoSpringBoot.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepo topicRepo;
	
	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring", "spring framework", "spring framework description"),
			new Topic("java", "core java", "core java description"),
			new Topic("javascript", "javascript", "Javascript description")
			));
	
	public List<Topic> getAllTopics(){
//		return topics;
		List<Topic> topics = new ArrayList<Topic>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
//		return topics.stream().filter
//				(t -> t.getId().equals(id)).findAny().get();
		return topicRepo.findById(id).orElse(new Topic());
		
	}

	public void addTopic(Topic topic) {
		topicRepo.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
//		for (int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		topicRepo.save(topic);
	}
	
	public void deleteTopic(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		topicRepo.deleteById(id);
	}
}
