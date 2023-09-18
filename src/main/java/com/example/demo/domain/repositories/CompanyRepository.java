package com.example.demo.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
