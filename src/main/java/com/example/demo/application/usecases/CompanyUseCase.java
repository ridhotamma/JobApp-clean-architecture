package com.example.demo.application.usecases;

import org.springframework.stereotype.Service;

import com.example.demo.domain.entities.Company;
import com.example.demo.domain.repositories.CompanyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyUseCase {
    private final CompanyRepository companyRepository;

    public CompanyUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Optional<Company> getCompanyById(Long id) {
        return companyRepository.findById(id);
    }

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company updateCompany(Long id, Company updatedCompany) {
        if (companyRepository.existsById(id)) {
            updatedCompany.setId(id);
            return companyRepository.save(updatedCompany);
        }
        return null;
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}
