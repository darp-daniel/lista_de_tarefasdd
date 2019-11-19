/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author Aluno03
 */
public class EmailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu email");
        String rem = sc.nextLine();
        System.out.println("Digite o destinatário");
        String des = sc.nextLine();
        System.out.println("Digite o assunto");
        String ass = sc.nextLine();
        System.out.println("Digite o corpo");
        String body = sc.nextLine();
        Email e = new Email();
        e.setRemetente(rem);
        e.setDestinatario(des);
        e.setAssunto(ass);
        e.setCorpo(body);
        System.out.println("De: " + e.getRemetente());
        System.out.println("Para: " + e.getDestinatario());
        System.out.println("Assunto: " + e.getAssunto());
        System.out.println(e.getCorpo());
    }
    
}
