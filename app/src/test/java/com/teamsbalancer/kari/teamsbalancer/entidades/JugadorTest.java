package com.teamsbalancer.kari.teamsbalancer.entidades;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class JugadorTest {

    public static final String NOMBRE = "Michael Jordan";

    @Test
    public void crearJugadorConNombre() throws Exception {
        Jugador jugador = new Jugador();
        jugador.setNombre(NOMBRE);

        assertThat(jugador.getNombre(), equalTo(NOMBRE));
    }
}