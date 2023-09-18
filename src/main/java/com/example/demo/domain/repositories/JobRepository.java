package com.example.demo.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.entities.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}