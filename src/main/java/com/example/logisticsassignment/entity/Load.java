package com.example.logisticsassignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.Date;


@Entity
@Data
public class Load {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loadId;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private String noOfTrucks;
    private String weight;
    private String comment;
    private String shipperId;
    private Date date;

}
