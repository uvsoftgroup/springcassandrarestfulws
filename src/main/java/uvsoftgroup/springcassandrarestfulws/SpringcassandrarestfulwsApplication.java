package uvsoftgroup.springcassandrarestfulws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@SpringBootApplication
@EntityScan(basePackages ={"uv.springcassandrarestfulws.model"})
@EnableCassandraRepositories(basePackages = {"uv.springcassandrarestfulws.repositories"})
//@EnableEurekaClient
//@EnableDiscoveryClient
public class SpringcassandrarestfulwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcassandrarestfulwsApplication.class, args);
	}
}
