package com.example.demo.presentation.dto;

import com.example.demo.domain.entities.Job;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobDTO {
    private Long id;
    private String title;
    private String description;
    private Long companyId;

    public static JobDTO mapToDTO(Job job) {
        return JobDTO.builder()
            .id(job.getId())
            .title(job.getTitle())
            .description(job.getDescription())
            .companyId(job.getCompany().getId())
            .build();
    }
}
