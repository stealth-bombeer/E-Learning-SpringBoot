package com.application.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.model.Course;
import com.application.repository.CourseRepository;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepo;
	
	public Course saveCourse(Course course)
	{
		return courseRepo.save(course);
	}
	
	public Course addNewCourse(Course course)
	{
		return courseRepo.save(course);
	}
	
	public List<Course> getAllCourses()
	{
		return (List<Course>)courseRepo.findAll();
	}
	
	public void updateEnrolledcount(String coursename, int enrolledcount)
	{
		courseRepo.updateEnrolledcount(enrolledcount, coursename);
	}
	
	public Course fetchCourseByCourseid(String courseid)
	{
		return courseRepo.findByCourseid(courseid);
	}

	
	public List<Course> fetchByCoursetype(String coursetype)
	{
		return (List<Course>)courseRepo.findByCoursetype(coursetype);
	}
	
	public List<Course> fetchByYoutubeurl(String youtubeurl)
	{
		return (List<Course>)courseRepo.findByYoutubeurl(youtubeurl);
	}
	
	public List<Course> fetchByWebsiteurl(String websiteurl)
	{
		return (List<Course>)courseRepo.findByWebsiteurl(websiteurl);
	}
	

	
}