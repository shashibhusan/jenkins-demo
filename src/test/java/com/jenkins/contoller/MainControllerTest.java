package com.jenkins.contoller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class MainControllerTest {

	@Test
	public void test() {
		boolean a=true;
		assertEquals(true, a);
	}

}
