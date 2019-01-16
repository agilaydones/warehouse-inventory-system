package com.revature.spark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.spark.beans.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{}
