package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta classe representa um terminal interativo para criar uma nova conta bancária.
 * O terminal solicita informações do cliente e cria uma nova conta corrente com base nos dados fornecidos.
 */
public class ContaTerminal {
    /**
     * Método principal que inicia a interação com o usuário para criar uma nova conta.
     *
     * @param args Os argumentos da linha de comando (não utilizado neste exemplo).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = sc.nextLine();
        Cliente cliente = new Cliente(nomeCliente);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();

        int contaBancaria = 0;
        while(contaBancaria == 0){
            try{
                System.out.println("Por favor, digite o número da conta: ");
                if (sc.hasNextInt()) {
                    contaBancaria = sc.nextInt();
                } else {
                    sc.nextLine();
                    throw new InputMismatchException("Valor inválido para Número da conta. Digite somente números inteiros.");
                }
            }
            catch (InputMismatchException ex){
                System.out.println("Valor invalido para Número da conta, Digite somente números sem casa decimal!");
            }
        }

        double saldo = 0.0;
        while(saldo == 0.0){
            try{
                System.out.println("Por favor, digite o seu Saldo na conta: ");
                if (sc.hasNextDouble()) {
                    saldo = sc.nextDouble();
                } else {
                    sc.nextLine();
                    throw new InputMismatchException("Valor inválido para Número da conta. Digite somente números inteiros.");
                }
            }
            catch (InputMismatchException ex){
                System.out.println("Valor invalido para Saldo na conta");
            }
        }



        ContaCorrente novaConta = new ContaCorrente(cliente, contaBancaria, saldo, agencia);
        novaConta.printBoasVindas();
    }
}