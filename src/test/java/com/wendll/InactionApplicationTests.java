package com.wendll;

import com.wendll.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InactionApplicationTests {

	@Autowired
	private BookController bookController;

	@Test
	public void contexLoads() throws Exception {
		assertThat(bookController).isNotNull();
	}

}
