package pe.edu.idat.app_cloud_pedidos_client_ec2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppCloudPedidosClientEc2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppCloudPedidosClientEc2Application.class, args);
	}

}
