package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {
    private Motorista m;
    private Corrida c;

    @BeforeEach
    void setUp(){
        m = new Motorista("123", "maria");
        Passageiro p = new Passageiro("321", "carlos");
        c = new Corrida(p);
    }

    @Test
    void constroi(){
        assertEquals("123", m.getCpf());
        assertEquals("maria", m.getNome());
    }

    @Test
    void mudaNome(){
        m.setNome("eduarda");
        assertEquals("eduarda", m.getNome());
    }

    @Test
    void avalia(){
        m.avalia(c,3);
        assertEquals(3, c.getNotaPassageiro());
    }

    @Test
    void avaliaBaixo(){
        m.avalia(c,0);
        assertEquals(1, c.getNotaPassageiro());
    }

    @Test
    void avaliaAlto(){
        m.avalia(c,6);
        assertEquals(5, c.getNotaPassageiro());
    }
}
