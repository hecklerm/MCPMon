package org.thehecklers.master;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.thehecklers.MCPMonApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MCPMonApplication.class)
@WebAppConfiguration
public class MCPMonApplicationTests {

	@Test
	public void contextLoads() {
	}

}
