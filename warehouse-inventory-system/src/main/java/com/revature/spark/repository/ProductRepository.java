package com.revature.spark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.spark.beans.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{}
