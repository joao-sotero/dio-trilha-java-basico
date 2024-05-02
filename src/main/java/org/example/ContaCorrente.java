package org.example;

/**
 * Representa uma conta corrente em um banco.
 */
public class ContaCorrente {
    private Integer Numero;  // Número da conta
    private String Agencia;  // Agência da conta
    private Double Saldo;    // Saldo da conta
    private Cliente Cliente;  // Cliente associado à conta

    /**
     * Construtor para criar uma nova instância de ContaCorrente.
     *
     * @param cliente O cliente associado à conta.
     * @param numero O número da conta.
     * @param saldo O saldo inicial da conta.
     * @param agencia A agência da conta.
     */
    public ContaCorrente(Cliente cliente, Integer numero, Double saldo, String agencia) {
        Numero = numero;
        Saldo = saldo;
        Agencia = agencia;
        Cliente = cliente;
    }

    /**
     * Obtém o número da conta.
     *
     * @return O número da conta.
     */
    public Integer getNumero() {
        return Numero;
    }

    /**
     * Obtém o saldo da conta.
     *
     * @return O saldo da conta.
     */
    public Double getSaldo() {
        return Saldo;
    }

    /**
     * Obtém a agência da conta.
     *
     * @return A agência da conta.
     */
    public String getAgencia() {
        return Agencia;
    }

    /**
     * Exibe uma mensagem de boas-vindas ao cliente da conta.
     * A mensagem inclui o nome do cliente, agência, número da conta e saldo disponível.
     */
    public void printBoasVindas() {
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Olá ").append(Cliente.getNome())
                .append(", Obrigado por criar uma conta em nosso banco, sua agência é ").append(Agencia)
                .append(", Conta ").append(Numero)
                .append(" e seu saldo ").append(Saldo)
                .append(", já está disponível para saque");

        System.out.println(mensagem);
    }
}
