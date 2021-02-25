package com.cmaccusco.primerproyecto.servicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ServicioContadorTest {
  
  private ServicioContador servicioContador;

  @Test
  public void testContar() {
    servicioContador = new ServicioContador();
    int result = servicioContador.contar();
    assertEquals(1, result);
  }

  @Test
  public void testDescontar0() {
    servicioContador = new ServicioContador();
    int result = servicioContador.descontar();
    assertEquals(0, result);
  }
}
