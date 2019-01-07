package com.practice.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService service;
	
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return service.getAllTopics();
		
		
	}
	
	@RequestMapping("/topics/{foo}")
	public Topic getTopic(@PathVariable("foo") String id) {
		
		return service.getTopic(id);
		
		
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		
		 service.addTopic(topic);
		
		
	}
	
	

	@RequestMapping(method=RequestMethod.PUT,value="/topics/{foo}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable("foo") String id) {
		
		 service.updateTopic(id, topic);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{foo}")
	public void deleteTopic(@PathVariable("foo") String id) {
		
		 service.deleteTopic(id);
		
		
	}
		
	
	
}
