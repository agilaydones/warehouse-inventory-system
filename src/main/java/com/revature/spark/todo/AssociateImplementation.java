package com.revature.spark.todo;

//import com.revature.spark.beans;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.revature.spark.beans.Product;
import com.revature.spark.beans.Warehouse;

import com.revature.spark.beans.*;

/**
 * Within this class, you will implement the logic to calculate data for various
 * reports.
 * 
 * @author Agilay Dones
 * 
 */
public class AssociateImplementation {
//Double productArr;
	/**
	 * Find the sum of all product assets. Remember that quantity times price is the
	 * total value for a given product.
	 * 
	 * @param products
	 * @return
	 */
	 
	
	
	public Double sum(List<Product> products) {
	double value = 0; 
		
		for(int i = 0; i < products.size(); i++ ) {
		double priceP = products.get(i).getPrice();
		int quantP = products.get(i).getQuantity();
		value += priceP*quantP;
		
		}
		
		return value;
		
		
		
	}

	/**
	 * Find the lowest product price out of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double min(List<Product> products) {
		double min = products.get(0).getPrice();
		for(int i = 0; i < products.size(); i++) {
			if(min > products.get(i).getPrice()) {
				min = products.get(i).getPrice();
			}
			
//		
					
	}
		
			
		return min;
		
		
	}
		
//	return null;
	
	/**
	 * Find the highest product price out of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double max(List<Product> products) {
		
		double maxP = products.get(0).getPrice();
		for(int i = 0; i < products.size(); i++) {
			if(maxP < products.get(i).getPrice()) {
				maxP = products.get(i).getPrice();
			}
			
//		
					
	}
		return maxP;	
	}

	/**
	 * Find the average product price of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double avg(List<Product> products) {
		double avg = 0;
		double sum = 0;
		for(int i = 0; i < products.size(); i++) {
			sum += products.get(i).getPrice();
			}
		avg = sum/products.size();
		return avg;
	}

	/**
	 * Find the median product price of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double median(List<Product> products) {
	int n = products.size();
	double[] myArr = new double[products.size()];
	double med = 0;
	for(int i = 0; i<n; i++) {
		myArr[i] = products.get(i).getPrice();
	}
		for (int i = 0; i < myArr.length-1; i++) {	
			for (int j = 0; j < myArr.length-1-i; j++) {
				if (myArr[j]>myArr[j+1]){ 
					double temp = myArr[j];
					myArr[j] = myArr[j+1];
					myArr[j+1] =temp; 
				}
			}
		}
		
		
		if(myArr.length%2==0) {
		double right = myArr[(n/2)];
		double left = myArr[(n/2)-1];
			med = (left + right)/2;
		}else if(myArr.length%2!=0) {
			med = myArr[(n/2)];
		}

		return med;
	}

	/**
	 * !! BONUS CHALLENGE REQUIREMENT !!
	 * 
	 * Find the total value of all products in each warehouse (total assets).
	 * 
	 * Let's look at some example data:
	 * 
	 * Warehouse A 
	 * Product 	| Price | Quantity 
	 * Rice 	| $3.40 | 8 
	 * Beans 	| $1.50 | 3
	 * ------------------------------------ 
	 * Warehouse B 
	 * Product 	| Price 	| Quantity
	 * TV 		| $50.25 	| 4 
	 * Speaker 	| $15.10 	| 6 
	 * -----------------------------------
	 * Result: 
	 * Warehouse A : $31.70 
	 * Warehouse B : $291.60
	 * 
	 * 
	 * @param products
	 * @return
	 */
	public Map<Warehouse, Double> totalAssetsPerWarehouse(List<Product> products) {
		return null;
	}

}
