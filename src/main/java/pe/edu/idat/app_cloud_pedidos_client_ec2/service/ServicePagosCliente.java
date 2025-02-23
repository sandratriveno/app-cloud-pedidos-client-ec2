package pe.edu.idat.app_cloud_pedidos_client_ec2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "app-cloud-pagos-client-ec2")
public interface ServicePagosCliente {

    @GetMapping("/mensaje")
    String obtenerPagos();

    // Llamará al endpoint en el Servicio de Pagos
    @GetMapping("/realizar-pago/{idPedido}")
    String realizarPago(@PathVariable("idPedido") Long idPedido);
}
