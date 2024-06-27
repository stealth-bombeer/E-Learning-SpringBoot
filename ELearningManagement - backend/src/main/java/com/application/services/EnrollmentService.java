package com.application.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.model.Enrollment;
import com.application.repository.EnrollmentRepository;

@Service
public class EnrollmentService 
{
	@Autowired
	private EnrollmentRepository enrollmentRepo;
	
	public Enrollment saveEnrollment(Enrollment enrollment)
	{
		return enrollmentRepo.save(enrollment);
	}
	
	public List<Enrollment> getAllEnrollments()
	{
		return (List<Enrollment>)enrollmentRepo.findAll();
	}
	
	public void updateEnrolledcount(String coursename, int enrolledcount)
	{
		enrollmentRepo.updateEnrolledcount(enrolledcount, coursename);
	}
	
	public Enrollment fetchByCoursename(String coursename)
	{
		return enrollmentRepo.findByCoursename(coursename);
	}
	
	public Enrollment fetchByCourseid(String courseid)
	{
		return enrollmentRepo.findByCourseid(courseid);
	}

	public List<Enrollment> fetchByEnrolleduserid(String enrolleduserid)
	{
		return (List<Enrollment>)enrollmentRepo.findByEnrolleduserid(enrolleduserid);
	}
	public List<Enrollment> fetchByInstructorname(String instructorname)
	{
		return (List<Enrollment>)enrollmentRepo.findByInstructorname(instructorname);
	}
	
	public List<Enrollment> fetchByCoursetype(String coursetype)
	{
		return (List<Enrollment>)enrollmentRepo.findByCoursetype(coursetype);
	}
	
	public List<Enrollment> fetchByYoutubeurl(String youtubeurl)
	{
		return (List<Enrollment>)enrollmentRepo.findByYoutubeurl(youtubeurl);
	}
	
	public List<Enrollment> fetchByWebsiteurl(String websiteurl)
	{
		return (List<Enrollment>)enrollmentRepo.findByWebsiteurl(websiteurl);
	}

}