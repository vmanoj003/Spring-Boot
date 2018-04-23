package com.SpringBoot.course;

import java.util.Arrays;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	//private List<Topic> allTopics = new ArrayList<>(Arrays.asList(new Topic("one","manoj","manojkumar velama"), new Topic("two","kumar velama","Kumars velama")));
	
	
	public List<Course> getCourses(String topicId){
		
		//return allTopics;
		List<Course> allTopics1 = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(allTopics1::add);
		return allTopics1;
	}
	
	
	public Course getCourse(String id){
		
		//return allTopics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}
	
	
	public void addCourse(Course course) {
		
		//allTopics.add(topic);
		courseRepository.save(course);
	}


	public void updateCourse(Course course) {
		
//		for(int i=0;i<allTopics.size();i++){
//			
//			Topic t = allTopics.get(i);
//			
//			if(t.getId().equals(id)) { 
//				allTopics.set(i,topic);
//				return;
//			}
//		}
		
		
		courseRepository.save(course);
		
	}


	public void deleteCourse(String id) {
		
	//	allTopics.removeIf(t -> t.getId().equals(id));
		
		courseRepository.delete(id);
		
	}

}
