package com.example.logisticsassignment.service;

import com.example.logisticsassignment.entity.Load;

import java.util.List;

public interface loadService {
    Load addShipment(Load load);
    List<Load> getLoadsByShipperId(String shipperId);
    Load getLoadById(Long loadId);
    Load updateLoad(Long loadId, Load updatedLoad);
    void deleteLoad(Long loadId);
}
