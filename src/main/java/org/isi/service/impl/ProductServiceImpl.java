package org.isi.service.impl;

import java.util.stream.Stream;

import org.isi.dao.ProductRepository;
import org.isi.model.Product;
import org.isi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void init() {
		Stream.of("Lg g6", "Ecran lcd 44pouces", "Printer HP X879").forEach((pName) -> {
			double price = 1000 + (int) (Math.random() * 9000);
			productRepository.save(new Product(pName, pName + price, price, (int) price / 8));
		});

		productRepository.findAll().forEach(System.out::println);
	}

}
