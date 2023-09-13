package com.example.socilamediamanager.mapper;


import com.example.socilamediamanager.dto.InfluencerDTO;
import com.example.socilamediamanager.model.Influencer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InfluencerMapper {
    Influencer toEntity(InfluencerDTO dto);

    InfluencerDTO toDto(Influencer influencer);


}
