package com.suda.waterorderapi.repository;

import com.suda.waterorderapi.domain.WaterOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WaterOrderRepository extends CrudRepository<WaterOrder, Long> {
    List<WaterOrder> findById(long id);
    List<WaterOrder> findAll();

}
