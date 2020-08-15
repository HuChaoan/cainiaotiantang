package com.bnzjy.course;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @description:
 * @author: Mr.Luo
 * @create: 2020-06-05 15:36
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories
@EnableSwagger2Doc
public class CourseInfoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CourseInfoApplication.class,args);
	}
}
