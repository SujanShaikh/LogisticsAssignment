package com.example.logisticsassignment.controller;

import com.example.logisticsassignment.entity.Load;
import com.example.logisticsassignment.service.loadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class loadController {

    @Autowired
    private loadService loadservice;

    @PostMapping("/loadData")
    public String saveShipment(@RequestBody Load load){
        this.loadservice.addShipment(load);
        return "Load details added successfully";
    }

    @GetMapping("/load/{loadId}")
    public Load getLoadById(@PathVariable Long loadId) {
        return loadservice.getLoadById(loadId);
    }

    @GetMapping("/shipId/{shipperId}")
    public List<Load> getLoadByShipperId(@PathVariable String shipperId) {
        return loadservice.getLoadsByShipperId(shipperId);
    }
    @PutMapping("/load/{loadId}")
    public Load updateLoad(@PathVariable Long loadId, @RequestBody Load updatedLoad) {
        return loadservice.updateLoad(loadId, updatedLoad);
    }

    @DeleteMapping("/load/{loadId}")
    public String deleteLoad(@PathVariable Long loadId) {
        this.loadservice.deleteLoad(loadId);
        return "Load deleted successfully";
    }

}
