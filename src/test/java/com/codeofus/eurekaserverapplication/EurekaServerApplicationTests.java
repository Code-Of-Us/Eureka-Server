package com.codeofus.eurekaserverapplication;

import com.netflix.eureka.EurekaServerConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EurekaServerApplicationTests {

	@Autowired
	private EurekaServerConfig eurekaServerConfig;

	@Test
	void checkEurekaServerConfigIsNotNull() {
		assertThat(eurekaServerConfig).isNotNull();
	}

}
