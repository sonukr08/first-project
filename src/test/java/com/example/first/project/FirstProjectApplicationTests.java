package com.example.first.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstProjectApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(FirstProjectApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("test case executing  for jenkinsS  new ");
		assertEquals(true, true);
	}

}
