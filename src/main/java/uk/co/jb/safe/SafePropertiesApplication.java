package uk.co.jb.safe;

import java.io.FileInputStream;
import java.util.Properties;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.properties.EncryptableProperties;

public class SafePropertiesApplication {

	public static void main(String[] args) {
		String encryptorPassword = System.getenv("ENCRYPT_PASSWORD");

		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword(encryptorPassword);

		Properties properties = new EncryptableProperties(encryptor);
		try {
			properties.load(new FileInputStream("src/main/resources/application.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		DataSource dataSource = new DataSource(
				properties.getProperty("datasource.url"),
				properties.getProperty("datasource.username"),
				properties.getProperty("datasource.password"));

		System.out.println(dataSource.toString());
	}

}
