package com.sawan.spring.springorm.products.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sawan.spring.springorm.products.dao.ProductsDao;
import com.sawan.spring.springorm.products.entity.Products;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sawan/spring/springorm/products/test/config.xml");
		ProductsDao dao = (ProductsDao) context.getBean("productDao");
		/*
		 * Products products = new Products(); products.setId(1);
		 * products.setName("Iphone"); products.setDesc("Its awesome!"); //
		 * products.setPrice(899);
		 * 
		 * // dao.create(products);
		 * 
		 * // products.setPrice(999); // dao.update(products);
		 * 
		 * // dao.delete(products);
		 */

		// Products products = dao.getOneRecord(2);
		
		List<Products> products = dao.getAllRecords();
		for(Products p : products) {
			System.out.println(p);
		}
		
	}

}