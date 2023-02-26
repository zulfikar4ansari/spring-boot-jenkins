package com.javatechie.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsApplicationTests {
	
	public static final Logger log = LoggerFactory.getLogger(SpringBootJenkinsApplicationTests.class);

	@Test
	void contextLoads() 
	{
		log.info("SpringBootJenkinsApplicationTests class executed");
		assertEquals(true, true);
	}

}
