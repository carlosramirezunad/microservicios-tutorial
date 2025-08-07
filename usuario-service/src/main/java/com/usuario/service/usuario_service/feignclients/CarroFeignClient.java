package com.usuario.service.usuario_service.feignclients;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.usuario.service.usuario_service.modelos.Carro;


@FeignClient(name = "carro-service", url = "http://localhost:8082")
public interface CarroFeignClient {

    @PostMapping(value = "/carro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Carro save(@RequestBody Carro carro);

    @GetMapping("/carro/usuario/{usuarioId}")
    public List<Carro> getCarros(@PathVariable("usuarioId") int usuarioId);
    
}
