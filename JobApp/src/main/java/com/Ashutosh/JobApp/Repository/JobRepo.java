package com.Ashutosh.JobApp.Repository;

import com.Ashutosh.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobPost = new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Devloper","TO devlop using Java SpringBoot",3, List.of("Spring","jsp")),
            new JobPost(2,"Java Full Stack","Java full stack web devlopment",
                    4,List.of("Java","Jsp","React")),
            new JobPost(3,"Web Full Stack","To devlop Java full stack devlopment",
                    3,List.of("JavaScript"))


    ));


    public List<JobPost> getAllJobs(){
        System.out.println("Printing all the jobs");
        return jobPost;
    }

    public void addJob(JobPost jobs){
        jobPost.add(jobs);
        System.out.println(jobPost);
    }

}
