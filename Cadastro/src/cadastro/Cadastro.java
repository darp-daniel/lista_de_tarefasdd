/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno03
 */
public class Cadastro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Usuario> us = new ArrayList();
        boolean running = true;
        String email;
        String senha;
        String src;
        int i;
        String op;
            while(running){
                System.out.println("==Bem - vindo, digite as opções listadas para navegar no programa :D ==\n"
                        + "[1]: Criar Usuários\n"
                        + "[2]: Listar Usuários\n"
                        + "[3]: Procurar Usuário\n"
                        + "[4]: Retirar Usuário\n"
                        + "[5]: Finalizar o programa\n"
                        + ":) Digite uma opção: ");
                        op = sc.nextLine();
                        switch(op){
                            case "1":
                                Usuario u = new Usuario();
                                System.out.println("Digite seu email ");
                                email = sc.nextLine();
                                System.out.println("Digite sua senha ");
                                senha = sc.nextLine();
                                u.atribuirEmail(email);
                                u.atribuirSenha(senha);
                                us.add(u);
                                break;
                            case "2":
                                    System.out.println("Usuários:");
                                for(i = 0; i < us.size(); i++){                              
                                        System.out.println("Usuário " + (i+1) + "\nEmail: " + us.get(i).mostrarEmail() + "\nSenha: " + us.get(i).mostrarSenha());
                            }
                                    break;
                            case "3":
                                System.out.println("Digite o email do Usuário ");
                                src = sc.nextLine();
                                int pos = 0;
                                boolean b = false;
                                for(i = 0;i < us.size();i++){
                                    if(src.equals(us.get(i).mostrarEmail())){
                                        b = true;
                                        pos = i;
                                    }
                                }
                                if(b == true){
                                    System.out.println(us.get(pos).mostrarEmail());
                                }else{
                                    System.out.println("Usuário inexistente");
                                }
                                break;
                            case "4":
                                for(i = 0; i< us.size(); i++){
                                    System.out.println("Usuário " + (i+1) + "\nEmail: " + us.get(i).mostrarEmail() + "\nSenha: " + us.get(i).mostrarSenha());
                                }
                                    int rmv;
                                    System.out.println("Digite o NÚMERO do usuário que você deseja retirar ");
                                    rmv = sc.nextInt();
                                    sc.nextLine();
                                    us.remove((rmv-1)).mostrarEmail();
                                    System.out.println("Usuário" + (i+1) + " removido com sucesso");
                                    break;
                            case "5":
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Opção inválida");
                            }
                        }
            }
    
        }

