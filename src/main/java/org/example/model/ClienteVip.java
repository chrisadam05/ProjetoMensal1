package org.example.model;

public class ClienteVip extends Cliente {

    public ClienteVip(String nome) {
        super(nome);
    }

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.15;
    }
}
