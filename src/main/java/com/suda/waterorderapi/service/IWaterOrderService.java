package com.suda.waterorderapi.service;

import com.suda.waterorderapi.domain.WaterOrder;

import java.util.List;

public interface IWaterOrderService {
    List<WaterOrder> findAll();

    void save(WaterOrder waterOrder);

    List<WaterOrder> findById(long parseLong);
}
