package com.revature.spark;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.revature.spark.beans.Product;
import com.revature.spark.todo.AssociateImplementation;

@RunWith(Parameterized.class)
public class AssociateImplementationTest {
	
	static AssociateImplementation testObj = new AssociateImplementation();
	
	public AssociateImplementationTest(List<Product> products, double sum, double min, double max, double avg, double median) {
		this.productList = products;
		this.sum = sum;
		this.min = min;
		this.max = max;
		this.avg = avg;
		this.median = median;
	} 
	
	List<Product> productList;
	
	double sum;
	
	double min;
	
	double max;
	
	double avg;
	
	double median;
	
	@Parameters
	public static List<Object[]> generateTestData() {
		List<Object[]> list = new ArrayList<>();
		// first test case
		list.add(new Object[] {
				Arrays.asList(new Object[] {
						new Product(1, "A", 1.25, 1, null),
						new Product(2, "B", 5.50, 1, null),
						new Product(3, "C",10.00, 1, null),
						new Product(4, "D", 0.15, 1, null),
						new Product(5, "E", 3.25, 1, null),
						new Product(6, "F",99.99, 1, null),
						new Product(7, "G",25.13, 1, null),
						new Product(8, "H",49.78, 1, null),
						new Product(9, "I",12.21, 1, null),
						new Product(10,"J", 5.00, 1, null)	
				}),
				212.26, // sum
				0.15, // min
				99.99, // max
				21.23, // avg
				7.75  // median
		});
		// second test case
		list.add(new Object[] {
				Arrays.asList(new Object[] {
						new Product(1, "A", 1.01, 1, null),
						new Product(2, "B", 7.29, 1, null),
						new Product(3, "C",11.00, 1, null),
						new Product(4, "D",62.15, 1, null),
						new Product(5, "E", 9.75, 1, null),
						new Product(6, "F",13.33, 1, null),
						new Product(7, "G",27.54, 1, null),
						new Product(8, "H",41.88, 1, null),
						new Product(9, "I", 9.21, 1, null),
						new Product(10,"J", 4.00, 1, null)	
				}),
				187.16, // sum
				1.01, // min
				62.15, // max
				18.72, // avg
				10.38  // median
		});
		return list;
	}
	
	@Test
	public void sumTest(){
		double testSum = testObj.sum(productList);
		assertEquals(sum, testSum, 0.01);
	}
	
	@Test
	public void minTest(){
		double testMin = testObj.min(productList);
		assertEquals(min, testMin, 0.01);
	}
	
	@Test
	public void maxTest(){
		double testMax = testObj.max(productList);
		assertEquals(max, testMax, 0.01);
	}
	
	@Test
	public void avgTest(){
		double testAvg = testObj.avg(productList);
		assertEquals(avg, testAvg, 0.01);
	}
	
	@Test
	public void medianTest(){
		double testMedian = testObj.median(productList);
		assertEquals(median, testMedian, 0.01);
	}
	
	@Test
	public void totalAssetsPerWarehouseTest(){
	}

}
