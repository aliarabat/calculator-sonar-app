package org.isi;

import static org.assertj.core.api.Assertions.assertThat;

import org.isi.dao.ProductRepository;
import org.isi.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorSonarAppApplicationTests {

	@Autowired
	ProductRepository pRepository;

	@Test
	void productExist() {
		Product pFounded = pRepository.getOne((long) 1);
		assertThat(pFounded).isNotNull();
	}

	void productDoesntExist() {
		Product pFounded = pRepository.getOne((long) 4);
		assertThat(pFounded).isNull();
	}

}
