package com.cmaccusco.primerproyecto.servicio;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ServicioSaludo {
  
  public String saludar(String nombre) {
    return "Hola " + Optional.ofNullable(nombre).orElse("anónimo");
  }
}
