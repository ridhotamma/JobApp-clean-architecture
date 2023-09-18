package com.example.demo.application.usecases;

import org.springframework.stereotype.Service;

import com.example.demo.domain.entities.Job;
import com.example.demo.domain.repositories.JobRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JobUseCase {
    private final JobRepository jobRepository;

    public JobUseCase(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public Job updateJob(Long id, Job updatedJob) {
        if (jobRepository.existsById(id)) {
            updatedJob.setId(id);
            return jobRepository.save(updatedJob);
        }
        return null;
    }

    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }
}
