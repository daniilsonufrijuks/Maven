package demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		Hello sayHello = new Hello();
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(sayHello.hello());
	}

}
