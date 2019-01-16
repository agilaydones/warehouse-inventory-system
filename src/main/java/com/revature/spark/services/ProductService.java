package com.revature.spark.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.spark.beans.Product;
import com.revature.spark.beans.Warehouse;
import com.revature.spark.repository.ProductRepository;
import com.revature.spark.repository.WarehouseRepository;
import com.revature.spark.todo.AssociateImplementation;

@Service
public class ProductService {

	/**
	 * In Spring, we would likely @Autowired this property. Just to keep the
	 * associate code free of Spring annotations, we opted to simply instantiate the
	 * old-fashioned way.
	 */
	private AssociateImplementation associateImplementation = new AssociateImplementation();

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private WarehouseRepository warehouseRepository;

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Product create(Product product) {
		validateWarehouse(product);
		Optional<Product> toSave = productRepository.findById(product.getId());
		if (toSave.isPresent()) {
			throw new RuntimeException("The record with identifier " + product.getId()
					+ " already exists. Please select a unique identifier.");
		} else {
			return productRepository.save(product);
		}
	}

	public Product update(Product product) {
		validateWarehouse(product);
		Optional<Product> toUpdate = productRepository.findById(product.getId());
		if (toUpdate.isPresent()) {
			Product update = toUpdate.get();
			update.setName(product.getName());
			update.setPrice(product.getPrice());
			update.setQuantity(product.getQuantity());
			update.setWarehouse(product.getWarehouse());
			return productRepository.save(update);
		} else {
			throw new RuntimeException("The record with identifier " + product.getId()
					+ " was not found. You cannot update a record that does not exist.");
		}
	}

	private void validateWarehouse(Product product) {
		Optional<Warehouse> warehouse = warehouseRepository.findById(product.getWarehouse().getId());
		if (!warehouse.isPresent()) {
			throw new RuntimeException("Warehouse record does not exist.");
		}
	}

	public void delete(Product product) {
		productRepository.delete(product);
	}

	public Double sum() {
		return associateImplementation.sum(productRepository.findAll());
	}

	public Double min() {
		return associateImplementation.min(productRepository.findAll());
	}

	public Double max() {
		return associateImplementation.max(productRepository.findAll());
	}

	public Double avg() {
		return associateImplementation.avg(productRepository.findAll());
	}

	public Double median() {
		return associateImplementation.median(productRepository.findAll());
	}

}
