package org.example.classes;

import classes.CuentaBancaria;
import classes.Usuario;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.assertEquals;

public class CuentaBancariaTest {

    private CuentaBancaria cuenta;

    private Usuario titular;

    @Before
    public void setup() {
        titular = new Usuario();
        titular.setNombre("Carlos");
        titular.setApellido("Paez");
        cuenta = new CuentaBancaria(titular);
    }

    @Test
    public void testGetUsuario(){
        assertEquals(titular, cuenta.getUsuario());
    }
    @Test
    public void testDepositar(){
        cuenta.depositar(500.0);
        assertEquals(500.0, cuenta.getSaldo(),0.01);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testDepostarCantidadNegativa(){
        cuenta.depositar(-500.0);
    }



}
