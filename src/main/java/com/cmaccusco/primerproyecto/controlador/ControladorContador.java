package com.cmaccusco.primerproyecto.controlador;

import com.cmaccusco.primerproyecto.servicio.ServicioContador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contador")
public class ControladorContador {
  /**
   * Servicio que sirve para mantener un contador de invocaciones.
   */
  private final ServicioContador servicioContador;

  public ControladorContador(ServicioContador servicioContador) {
    this.servicioContador = servicioContador;
  }

  @GetMapping
  public int contar() {
    return servicioContador.contar();
  }
}
