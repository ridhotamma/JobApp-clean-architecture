package com.example.demo.presentation.dto;

import com.example.demo.domain.entities.Company;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyDTO {
    private Long id;
    private String name;
    private String description;

    public static CompanyDTO mapToDTO(Company company) {
        return CompanyDTO.builder()
            .id(company.getId())
            .name(company.getName())
            .description(company.getDescription())
            .build();
    }
}
