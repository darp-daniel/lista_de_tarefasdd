/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroProduto;

import java.util.Scanner;

/**
 *
 * @author Aluno03
 */
public class RegistroProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        String nome;
        String codigo;
        int estoque;
        float preço;
            System.out.println("Digite o nome do produto");
            nome = sc.nextLine();
            System.out.println("Digite o código do produto");
            codigo = sc.nextLine();
            System.out.println("Digite a quantidade no estoque do produto");
            estoque = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o preço do produto");
            preço = sc.nextFloat();
            sc.nextLine();
            p.setNome(nome);
            p.setCodigo(codigo);
            p.setEstoque(estoque);
            p.setPreço(preço);
            System.out.println("Produto: " + p.getNome() + "\n"
                    + "Código: " + p.getCodigo() + "\n"
                    + "Estoque: " + p.getEstoque() + "\n"
                    + "Preço: " + p.getPreço());
    }
    
}
