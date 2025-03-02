package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    List<Corrida> corridas;

    public Central() {
        this.corridas = new ArrayList<>();
    }

    public void adiciona(Corrida corrida){
        corridas.add(corrida);
    }

    public double mediaPassageiro(String cpf){
        int soma = 0;
        int tamanho = 0;

        for (Corrida corrida:corridas){
            if(corrida.getPassageiro().getCpf().equals(cpf)) {
                int nota = corrida.getNotaPassageiro();
                if (nota > 0) {
                    soma += nota;
                    tamanho++;
                }
            }
        }
        return (double) soma/tamanho;
    }

    public double mediaMotorista(String cpf){
        int soma = 0;
        int tamanho = 0;

        for (Corrida corrida:corridas){
            if(corrida.getMotorista().getCpf().equals(cpf)) {
                int nota = corrida.getNotaMotorista();
                if (nota > 0) {
                    soma += nota;
                    tamanho++;
                }
            }
        }
        return (double) soma/tamanho;
    }
}
