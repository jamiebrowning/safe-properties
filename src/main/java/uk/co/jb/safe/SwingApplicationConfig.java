package uk.co.jb.safe;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;
import org.jasypt.spring31.properties.EncryptablePropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan
public class SwingApplicationConfig {

	@Bean
	static EncryptablePropertyPlaceholderConfigurer propertyPlaceHolderConfigurer() {
		EncryptablePropertyPlaceholderConfigurer configurer = new EncryptablePropertyPlaceholderConfigurer(
				configurationEncryptor());
		configurer.setLocation(new ClassPathResource("application.properties"));
		return configurer;
	}

	@Bean
	static EnvironmentStringPBEConfig environmentVariablesConfiguration() {
		EnvironmentStringPBEConfig config = new EnvironmentStringPBEConfig();
		config.setAlgorithm("PBEWITHMD5ANDDES");
		config.setPasswordEnvName("ENCRYPT_PASSWORD");
		return config;
	}

	@Bean
	static StandardPBEStringEncryptor configurationEncryptor() {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setConfig(environmentVariablesConfiguration());
		return encryptor;
	}

}