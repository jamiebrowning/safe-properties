package uk.co.jb.safe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataSource {

	@Value("${datasource.url}")
	private String url;

	@Value("${datasource.username}")
	private String username;

	@Value("${datasource.password}")
	private String password;

	public DataSource() {}

	public DataSource(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String toString() {
		return String.format("datasource{url=%s;user=%s;password=%s}", url, username, password);
	}
}
