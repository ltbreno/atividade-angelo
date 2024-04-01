package com.example.demo;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das classes ContaEspecial e ContaInvestimento
        ContaEspecial contaEspecial = new ContaEspecial("Platinum", 5000.0);
        ContaInvestimento contaInvestimento = new ContaInvestimento("Ações", 10000.0);

        // Exibindo saldos das contas
        contaEspecial.exibirSaldo();
        contaInvestimento.exibirSaldo();
    }
}
