package com.SpringBoot.topic;

import java.util.Arrays;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private List<Topic> allTopics = new ArrayList<>(Arrays.asList(new Topic("one","manoj","manojkumar velama"), new Topic("two","kumar velama","Kumars velama")));
	
	
	public List<Topic> getTopics(){
		
		return allTopics;
	}
	
	
	public Topic getTopic(String id){
		
		return allTopics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}
	
	
	public void addTopic(Topic topic) {
		
		allTopics.add(topic);
	}


	public void updateTopic(String id, Topic topic) {
		
		for(int i=0;i<allTopics.size();i++){
			
			Topic t = allTopics.get(i);
			
			if(t.getId().equals(id)) { 
				allTopics.set(i,topic);
				return;
			}
		}
		
	}


	public void deleteTopic(String id) {
		
		allTopics.removeIf(t -> t.getId().equals(id));
		
	}

}
