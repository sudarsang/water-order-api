package com.suda.waterorderapi.controller;

import com.suda.waterorderapi.domain.OrderStatus;
import com.suda.waterorderapi.domain.WaterOrder;
import com.suda.waterorderapi.dto.WaterOrderDto;
import com.suda.waterorderapi.service.IWaterOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/waterOrders")
public class WaterOrderController {
    @Autowired
    private IWaterOrderService waterOrderService;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createWaterOrder(@RequestBody @Validated WaterOrderDto waterOrderDto) {
        System.out.println("Processing post request for " + waterOrderDto);
        waterOrderDto.setOrderStatus(OrderStatus.REQUESTED);
        waterOrderService.save(convertToEntity(waterOrderDto));
    }

    @GetMapping
    public List<WaterOrderDto> getAllWaterOrders() {
        List<WaterOrder> waterOrders = waterOrderService.findAll();

        return waterOrders.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private WaterOrderDto convertToDto(WaterOrder waterOrder) {

        return modelMapper.map(waterOrder, WaterOrderDto.class);
    }

    private WaterOrder convertToEntity(WaterOrderDto waterOrderDto) {

        return modelMapper.map(waterOrderDto, WaterOrder.class);
    }
}
