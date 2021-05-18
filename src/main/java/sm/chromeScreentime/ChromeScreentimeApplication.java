package sm.chromeScreentime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})//몽고디비 연결이 우너활하지 않아 잠시 적어두었다.
public class ChromeScreentimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChromeScreentimeApplication.class, args);
	}

}
