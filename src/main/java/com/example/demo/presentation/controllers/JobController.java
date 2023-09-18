package com.example.demo.presentation.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.demo.application.usecases.JobUseCase;
import com.example.demo.domain.entities.Job;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private final JobUseCase jobUseCase;

    public JobController(JobUseCase jobUseCase) {
        this.jobUseCase = jobUseCase;
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobUseCase.getAllJobs();
    }

    @GetMapping("/{id}")
    public Optional<Job> getJobById(@PathVariable Long id) {
        return jobUseCase.getJobById(id);
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobUseCase.createJob(job);
    }

    @PutMapping("/{id}")
    public Job updateJob(@PathVariable Long id, @RequestBody Job updatedJob) {
        return jobUseCase.updateJob(id, updatedJob);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        jobUseCase.deleteJob(id);
    }
}
