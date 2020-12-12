package com.suda.waterorderapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.suda.waterorderapi.domain.OrderStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class WaterOrderDto {
    @JsonIgnore
    private long id;
    private String farmId;
    private Date startTime;
    private double duration;
    private OrderStatus orderStatus;
}
