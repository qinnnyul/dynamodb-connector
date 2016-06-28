package com.thoughtworks.nosql.spike;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DynamodbApplication.class)
public class DynamodbApplicationTests {

	@Test
	public void contextLoads() {
	}

}
