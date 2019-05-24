package com.leaderment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@MapperScan("com.leaderment.mapper.mybatis")
@SpringBootApplication
@EnableEurekaClient
public class InventoryApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(InventoryApplication.class, args);
		}catch(Exception error){
			System.err.println("启动报错"+ error);
		}
	}

	//为了打包springboot项目
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}

}
