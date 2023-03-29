package org.example.classes;

import classes.Usuario;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsuarioTest {

    private Usuario usuario;

    @Before
    public void setup() {
        usuario = new Usuario("Juan", "Perez");
    }

    @Test
    public void testGetNombre() {
        assertEquals("Juan", usuario.getNombre());
    }

    @Test
    public void testGetApellido() {
        assertEquals("Perez", usuario.getApellido());
    }

    @Test
    public void testToString() {
        assertEquals("Nombre:Juan, Apellido:Perez",usuario.toString());}
    }
