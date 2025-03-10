package pe.edu.idat.demo_feign_client_basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableFeignClients
@SpringBootApplication
public class DemoFeignClientBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignClientBasicApplication.class, args);
	}

}
