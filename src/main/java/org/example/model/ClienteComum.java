package org.example.model;

public class ClienteComum extends Cliente {

    public ClienteComum(String nome) {
        super(nome);
    }

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.05;
    }
}