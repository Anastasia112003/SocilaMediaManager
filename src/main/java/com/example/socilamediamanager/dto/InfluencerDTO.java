package com.example.socilamediamanager.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InfluencerDTO {
    private Long id;
    private Integer subsAmount;
    private List<SubscriberDTO> subsList;
    private LocalDateTime lastUpdate;
}

