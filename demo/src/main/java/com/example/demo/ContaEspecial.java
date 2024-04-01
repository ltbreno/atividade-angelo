package com.example.demo;
class ContaEspecial {
    private String tipo;
    private Double saldo;

    public ContaEspecial(String tipo, Double saldo) {
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public void exibirSaldo() {
        System.out.println("Saldo da Conta Especial (" + tipo + "): " + saldo);
    }
}
