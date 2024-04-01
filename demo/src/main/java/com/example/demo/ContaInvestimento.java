package com.example.demo;

class ContaInvestimento {
    private String tipo;
    private double saldo;

    public ContaInvestimento(String tipo, double saldo) {
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public void exibirSaldo() {
        System.out.println("Saldo da Conta de Investimento (" + tipo + "): " + saldo);
    }
}
