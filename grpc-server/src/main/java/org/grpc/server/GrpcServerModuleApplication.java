package org.grpc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author milton
 */

@SpringBootApplication
public class GrpcServerModuleApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GrpcServerModuleApplication.class, args);
		System.out.println("GrpcServerModuleApplication");
	}
}
