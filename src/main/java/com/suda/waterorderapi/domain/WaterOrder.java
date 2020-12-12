package com.suda.waterorderapi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class WaterOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String farmId;

    @Column
    private Date startTime;

    @Column
    private double duration;

    @Column
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
