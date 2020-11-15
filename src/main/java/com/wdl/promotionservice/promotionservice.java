package com.wdl.promotionservice;

import com.wdl.promotionservice.repository.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@EnableMongoRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
@EnableFeignClients(basePackages = {"com.wdl.promotionservice"})
@EnableCircuitBreaker
@EnableHystrixDashboard
public class promotionservice {

	public static void main(String[] args) {

		SpringApplication.run(promotionservice.class, args);
	}

}
