package pe.edu.idat.app_cloud_pedidos_client_ec2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-cloud-pagos-client-ec2")
public interface ServicePagosCliente {

    @GetMapping("/mensaje")
    String obtenerPagos();
}
