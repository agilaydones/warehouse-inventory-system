package com.revature.spark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.spark.beans.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Integer>{}
