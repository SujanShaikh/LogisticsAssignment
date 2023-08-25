package com.example.logisticsassignment.service.loadServiceImpl;

import com.example.logisticsassignment.entity.Load;
import com.example.logisticsassignment.repository.loadRepository;
import com.example.logisticsassignment.service.loadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class loadServiceImpl implements loadService {
    @Autowired
    private loadRepository loadrepository;
    @Override
    public Load addShipment(Load load) {
        return loadrepository.save(load);
    }
    @Override
    public List<Load> getLoadsByShipperId(String shipperId) {
        return loadrepository.findByShipperId(shipperId);
    }

    @Override
    public Load getLoadById(Long loadId) {
        return loadrepository.findById(loadId).orElse(null);
    }

    @Override
    public Load updateLoad(Long loadId, Load updatedLoad) {
        return loadrepository.findById(loadId)
                .map(load -> {
                    if (Objects.nonNull(updatedLoad.getLoadingPoint())) {
                        load.setLoadingPoint(updatedLoad.getLoadingPoint());
                    }
                    if (Objects.nonNull(updatedLoad.getUnloadingPoint())) {
                        load.setUnloadingPoint(updatedLoad.getUnloadingPoint());
                    }
                    if (Objects.nonNull(updatedLoad.getProductType())) {
                        load.setProductType(updatedLoad.getProductType());
                    }
                    if (Objects.nonNull(updatedLoad.getTruckType())) {
                        load.setTruckType(updatedLoad.getTruckType());
                    }
                    if (Objects.nonNull(updatedLoad.getNoOfTrucks())) {
                        load.setNoOfTrucks(updatedLoad.getNoOfTrucks());
                    }
                    if (Objects.nonNull(updatedLoad.getWeight())) {
                        load.setWeight(updatedLoad.getWeight());
                    }
                    if (Objects.nonNull(updatedLoad.getComment())) {
                        load.setComment(updatedLoad.getComment());
                    }
                    if (Objects.nonNull(updatedLoad.getShipperId())) {
                        load.setShipperId(updatedLoad.getShipperId());
                    }
                    if (Objects.nonNull(updatedLoad.getDate())) {
                        load.setDate(updatedLoad.getDate());
                    }

                    return loadrepository.save(load);
                })
                .orElse(null);
    }

    @Override
    public void deleteLoad(Long loadId) {
       loadrepository.deleteById(loadId);
    }
}
