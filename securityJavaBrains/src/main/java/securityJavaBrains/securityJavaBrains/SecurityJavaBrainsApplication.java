package securityJavaBrains.securityJavaBrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@SpringBootApplication
public class SecurityJavaBrainsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityJavaBrainsApplication.class, args);
	}

}
