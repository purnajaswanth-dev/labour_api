package com.labour.system.service;

import com.labour.system.model.Job;
import com.labour.system.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findByIsActiveTrue();
    }

    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }
}
