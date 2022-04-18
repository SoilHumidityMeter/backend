package com.soilhumidity.backend.dto.measurement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.soilhumidity.backend.dto.seed.SeedDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeasurementDto {

    private Long id;

    private Double humidity;

    private Long deviceId;

    private Date createdAt;

    private List<SeedDto> eligibleSeeds;
}
