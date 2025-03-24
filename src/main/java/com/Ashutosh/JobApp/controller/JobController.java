package com.Ashutosh.JobApp.controller;

import com.Ashutosh.JobApp.model.JobPost;
import com.Ashutosh.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {


    @Autowired
    public JobService service;

    @RequestMapping({"/","home"})
    public String home(){
        return "home";
    }
    @RequestMapping("viewalljobs")
    public String viewAllJobs(Model model){
        List<JobPost> jobs = service.getALjobs();
        model.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }

    @RequestMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){

        service.addJob(jobPost);

        return "success";

    }


}
