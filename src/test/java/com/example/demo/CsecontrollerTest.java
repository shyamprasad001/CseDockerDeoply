package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CsecontrollerTest {
	@Autowired
	Csecontroller c;
	@Test
	void testCseadd() {
		int result = c.cseadd(2,3);
		assertEquals(5, result);
	}

	@Test
	void testCsemul() {
		int result = c.csemul(2, 3);
		assertEquals(6, result);
	}

}
