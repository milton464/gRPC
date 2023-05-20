package org.grpc.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author milton
 */
@SpringBootApplication
public class GrpcClientModuleApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GrpcClientModuleApplication.class, args);
		System.out.println("GrpcClientModuleApplication");
		
	}
}
