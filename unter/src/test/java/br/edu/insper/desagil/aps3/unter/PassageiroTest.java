package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    private Passageiro p;
    private Corrida c;
    @BeforeEach
    void setUp(){
        p = new Passageiro("123", "maria");
        c = new Corrida(p);
    }

    @Test
    void constroi(){
        assertEquals("123", p.getCpf());
        assertEquals("maria", p.getNome());
    }

    @Test
    void mudaNome(){
        p.setNome("eduarda");
        assertEquals("eduarda", p.getNome());
    }

    @Test
    void avalia(){
        p.avalia(c, 3);
        assertEquals(3,c.getNotaMotorista());
    }

    @Test
    void avaliaBaixo(){
        p.avalia(c, 0);
        assertEquals(1,c.getNotaMotorista());
    }

    @Test
    void avaliaAlto(){
        p.avalia(c, 6);
        assertEquals(5,c.getNotaMotorista());
    }
}
