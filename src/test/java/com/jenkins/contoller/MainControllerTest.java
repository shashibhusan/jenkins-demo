package com.jenkins.contoller;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
class MainControllerTest {

	@Test
	void test() {
		System.out.println("This is test case");
		assertEquals(true,true);
	}

}
