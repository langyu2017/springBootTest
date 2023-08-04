package com.example.demo0727;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.example.demo0727.mapper")
public class Demo0727Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo0727Application.class, args);
		System.out.println("启动完成");
	}

}
