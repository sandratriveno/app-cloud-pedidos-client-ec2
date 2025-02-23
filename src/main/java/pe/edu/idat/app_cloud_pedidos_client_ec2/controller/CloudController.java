package pe.edu.idat.app_cloud_pedidos_client_ec2.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.app_cloud_pedidos_client_ec2.service.ServicePagosCliente;

@RestController

public class CloudController {

    private final ServicePagosCliente servicePagosCliente;

    @Value("${mensaje:Default mensaje}")
    private String mensaje;

    public CloudController(ServicePagosCliente servicePagosCliente) {
        this.servicePagosCliente = servicePagosCliente;
    }

    @GetMapping("/mensaje")
    public String verMensajeCloud(){
        return mensaje;
    }

    @GetMapping("/pago-pedido")
    public  String obtenerPagos(){
        return servicePagosCliente.obtenerPagos();
    }

    @GetMapping("/realizar-pago/{idPedido}")
    public String realizarPago(@PathVariable Long idPedido) {
        return servicePagosCliente.realizarPago(idPedido);
    }
}
