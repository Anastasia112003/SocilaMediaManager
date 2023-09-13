package com.example.socilamediamanager.service;

import com.example.socilamediamanager.dto.InfluencerDTO;
import com.example.socilamediamanager.mapper.InfluencerMapper;
import com.example.socilamediamanager.model.Influencer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MediaManagerService {
    private final KafkaTemplate<String, Object> kafkaTemplate;
    private InfluencerMapper influencerMapper;


    public MediaManagerService(KafkaTemplate<String, Object> kafkaTemplate, InfluencerMapper influencerMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.influencerMapper = influencerMapper;
    }

    @KafkaListener(topics = "influencer")
    public void receiveOrder(InfluencerDTO dto) {
        Influencer influencer = influencerMapper.toEntity(dto);
        kafkaTemplate.send("manager", dto);
        System.out.println(influencer);
    }

}


