package com.example.logisticsassignment.repository;

import com.example.logisticsassignment.entity.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface loadRepository extends JpaRepository<Load, Long> {
    List<Load> findByShipperId(String shipperId);

}
