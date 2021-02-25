package com.cmaccusco.primerproyecto.servicio;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

@Service
public class ServicioContador {

  private final AtomicInteger contador;

  public ServicioContador() {
    this.contador = new AtomicInteger(0);
  }

  public int contar() {
    return this.contador.incrementAndGet();
  }
}
