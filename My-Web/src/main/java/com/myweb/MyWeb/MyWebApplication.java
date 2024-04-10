package com.myweb.MyWeb;

import com.myweb.MyWeb.models.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWebApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(MyWebApplication.class, args);
			Laptop laptop = new Laptop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
