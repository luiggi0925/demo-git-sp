package com.cmaccusco.primerproyecto.controlador;

import com.cmaccusco.primerproyecto.servicio.ServicioSaludo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class ControladorSaludo {
  private final ServicioSaludo servicioSaludo;
  public ControladorSaludo(ServicioSaludo servicioSaludo) {
    this.servicioSaludo = servicioSaludo;
  }

  @GetMapping
  public String saludar(@RequestParam(name = "nombre", required = false) String nombre) {
    return servicioSaludo.saludar(nombre);
  }
}
