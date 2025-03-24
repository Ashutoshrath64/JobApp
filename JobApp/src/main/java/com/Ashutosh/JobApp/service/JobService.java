package com.Ashutosh.JobApp.service;

import com.Ashutosh.JobApp.Repository.JobRepo;
import com.Ashutosh.JobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    //method to add job
    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    //method to return all job
    public List<JobPost> getALjobs(){
        return repo.getAllJobs();
    }


}
