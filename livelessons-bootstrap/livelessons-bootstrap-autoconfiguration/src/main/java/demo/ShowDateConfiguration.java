package demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;

//import org.apache.catalina.startup.Tomcat;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name="custom.showdate", matchIfMissing=true)
public class ShowDateConfiguration {
	
	private static Log logger = LogFactory
			.getLog(LogTomcatVersionAutoConfiguration.class);
	@PostConstruct
	public void logDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		logger.info("\n\n\nCurrent time: "
				+ dateFormat.format(date) + "\n\n");
	}
}
