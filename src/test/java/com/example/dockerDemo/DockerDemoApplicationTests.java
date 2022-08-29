package com.example.dockerDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class DockerDemoApplicationTests {

	
	public   Logger logger = (Logger) LoggerFactory.getLogger(DockerDemoApplicationTests.class);
	
	@Test
	void contextLoads() {
		
		logger.info("welcome to jenkin");
		assertEquals(true, true);
	}

}
