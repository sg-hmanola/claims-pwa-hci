package claimspwahci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ClaimsPwaHciApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ClaimsPwaHciApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ClaimsPwaHciApplication.class, args);
	}

}
