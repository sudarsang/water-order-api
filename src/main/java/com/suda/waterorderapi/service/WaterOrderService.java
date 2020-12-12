package com.suda.waterorderapi.service;

import com.suda.waterorderapi.domain.WaterOrder;
import com.suda.waterorderapi.repository.WaterOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterOrderService implements IWaterOrderService {
    @Autowired
    WaterOrderRepository waterOrderRepository;

    @Override
    public List<WaterOrder> findAll() {
        return waterOrderRepository.findAll();
    }

    @Override
    public void save(WaterOrder waterOrder) {
        waterOrderRepository.save(waterOrder);
    }

    @Override
    public List<WaterOrder> findById(long id) {
        return waterOrderRepository.findById(id);
    }
}
