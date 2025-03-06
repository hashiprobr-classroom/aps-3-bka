package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    private Central c;

    @BeforeEach
    void setUp(){
        c = new Central();
    }

    @Test
    void nenhumaAvaliacaoPassageiro(){
        assertEquals(0,c.mediaPassageiro("123"));
    }

    @Test
    void nenhumaAvaliacaoMotorista(){
        assertEquals(0,c.mediaMotorista("123"));
    }

    @Test
    void avaliacoesPassageiro(){
        Passageiro passageiro1 = new Passageiro("123", "maria");
        Corrida corrida1 = new Corrida(passageiro1);
        Corrida corrida2 = new Corrida(passageiro1);
        Corrida corrida3 = new Corrida(passageiro1);
        corrida2.avaliaPassageiro(4);
        corrida3.avaliaPassageiro(5);
        c.adiciona(corrida1);
        c.adiciona(corrida2);
        c.adiciona(corrida3);

        Passageiro passageiro2 = new Passageiro("345", "eduarda");
        Corrida corrida4 = new Corrida(passageiro2);
        c.adiciona(corrida4);

        assertEquals(4.5, c.mediaPassageiro("123"));
    }

    @Test
    void avaliacoesMotorista(){
        Passageiro passageiro = new Passageiro("123", "maria");
        Motorista motorista1 = new Motorista("987","clara");

        Corrida corrida1 = new Corrida(passageiro);
        corrida1.setMotorista(motorista1);
        c.adiciona(corrida1);

        Corrida corrida2 = new Corrida(passageiro);
        corrida2.setMotorista(motorista1);
        corrida2.avaliaMotorista(2);
        c.adiciona(corrida2);

        Corrida corrida3 = new Corrida(passageiro);
        corrida3.setMotorista(motorista1);
        corrida3.avaliaMotorista(3);
        c.adiciona(corrida3);

        Motorista motorista2 = new Motorista("567","eduarda");
        Corrida corrida4 = new Corrida(passageiro);
        corrida4.setMotorista(motorista2);
        corrida4.avaliaMotorista(1);
        c.adiciona(corrida4);

        Corrida corrida5 = new Corrida(passageiro);
        corrida5.avaliaMotorista(1);

        assertEquals(2.5, c.mediaMotorista("987"));
    }

}
