package org.example;

/**
 * Representa um cliente do banco.
 */
public class Cliente {
    private String Nome;  // Nome do cliente

    /**
     * Construtor para criar um novo cliente com o nome especificado.
     *
     * @param nome O nome do cliente.
     */
    public Cliente(String nome) {
        Nome = nome;
    }

    /**
     * Obtém o nome do cliente.
     *
     * @return O nome do cliente.
     */
    public String getNome() {
        return Nome;
    }

    /**
     * Define o nome do cliente.
     *
     * @param nome O novo nome do cliente.
     */
    public void setNome(String nome) {
        Nome = nome;
    }
}
