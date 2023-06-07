package claimspwahci.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import claimspwahci.bean.HCIClient;

@Configuration
public class SoapClientConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
		jaxb2Marshaller.setContextPath("claimspwahci.generated");
		return jaxb2Marshaller;
	}

	@Bean
	public HCIClient articleClient(Jaxb2Marshaller jaxb2Marshaller) {
		HCIClient articleClient = new HCIClient();
		articleClient.setDefaultUri("http://209.203.79.46:10033/web/services/WWR450Service/WWR450");
		articleClient.setMarshaller(jaxb2Marshaller);
		articleClient.setUnmarshaller(jaxb2Marshaller);
		return articleClient;
	}
}