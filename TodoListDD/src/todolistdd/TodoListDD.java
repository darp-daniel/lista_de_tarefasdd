/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolistdd;

import java.util.Scanner;

/**
 *
 * @author Aluno03
 */
public class TodoListDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario u = new Usuario();
        System.out.println("Por favor cadastre-se, digite seu e-mail");
        u.email = sc.nextLine();
        u.colocarEmail();
        System.out.println("digite a sua senha");
        u.senha = sc.nextLine();
        u.colocarSenha();
        u.confirmarSenha();
    }
    
}
