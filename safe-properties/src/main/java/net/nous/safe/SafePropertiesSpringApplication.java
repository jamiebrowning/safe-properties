package net.nous.safe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SafePropertiesSpringApplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SwingApplicationConfig.class);
		DataSource dataSource = context.getBean(DataSource.class);
		System.out.println(dataSource.toString());
	}

}
