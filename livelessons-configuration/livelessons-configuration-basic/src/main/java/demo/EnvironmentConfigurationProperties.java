package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentConfigurationProperties {
	@Autowired
	public void setEnv(Environment env) {
		System.out.println("Env properties :" + env.getProperty("test.version"));
	}

}
