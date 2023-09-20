package cmt.software.cine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CineApplication {

	public static void main(String[] args) {

		SpringApplication.run(CineApplication.class, args);
		/*String test = "hola quiero ser un hash";
		System.out.println("Value whithout hashCode: " + test);
		System.out.println("Value whith hashCode: " + test.hashCode());*/
	}

}
