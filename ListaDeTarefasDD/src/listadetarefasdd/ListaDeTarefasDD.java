/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadetarefasdd;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno03
 */
public class ListaDeTarefasDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email;
        String senha;
        boolean running = true;
            while(running){
                System.out.println("==Bem-Vindo a ToDoList, escolha uma das opções abaixo==");
                System.out.println("[1]: Criar Usuário");
                System.out.println("[2]: Login");
                System.out.println("[3]: Finalizar o programa");
                String op = sc.nextLine();
                    switch(op){
                        case "1":
                            System.out.print("Digite o email: ");
                            email = sc.nextLine();
                            System.out.print("Digite a senha: ");
                            senha = sc.nextLine();
                            Usuario u = new Usuario();
                            ArrayList <Tarefas> ts = new ArrayList();
                            u.setEmail(email);
                            u.setSenha(senha);
                            DAO.addUsuario(u);
                            u.setT(ts);
                            break;
                        case "2":
                            boolean achou = false;
                            System.out.print("Digite o email: ");
                            email = sc.nextLine();
                            System.out.print("Digite a senha: ");
                            senha = sc.nextLine();
                            Usuario temp = DAO.srcUEmail(email);
                            if(temp != null && senha.equals(temp.senha)){
                                DAO.usuarioLogin = temp;
                                homePage();
                            }else{
                                System.out.println("Usuario ou senha incorretos!!");
                            }
                            break;
                        case "3":
                            running = false;
                            break;
                    }
            }
    }
    public static void homePage(){
        Scanner sc = new Scanner(System.in);
        int id;
        while(DAO.usuarioLogin != null){
            System.out.println("==Bem-vindo Usuário, escolha uma das opções abaixo==");
            System.out.println("[1]: Adicionar Tarefa");
            System.out.println("[2]: Listar Tarefas");
            System.out.println("[3]: Finalizar Tarefa");
            System.out.println("[4]: Remover Tarefa");
            System.out.println("[5]: Logout");
            String op = sc.nextLine();
            switch(op){
                case "1":
                    System.out.print("Digite uma Tarefa: ");
                    String titulo = sc.nextLine();
                    boolean status = false;
                    Tarefas t = new Tarefas();
                    t.setTitulo(titulo);
                    t.setStatus(status);
                    DAO.usuarioLogin.addTarefa(t);
                    break;
                case "2":
                    for(int i = 0;i < DAO.usuarioLogin.getT().size();i++){
                        System.out.println("Tarefa " + (i+1));
                        System.out.println("\tTitulo: " + DAO.usuarioLogin.getT().get(i).getTitulo());
                        System.out.println("\tStatus: " + DAO.usuarioLogin.getT().get(i).isStatus());
                    }
                    break;
                case "3":
                    for(int i = 0;i < DAO.usuarioLogin.getT().size();i++){
                        if(DAO.usuarioLogin.getT().get(i).isStatus() == false){
                        System.out.println("Tarefa " + (i+1));
                        System.out.println("\tTitulo: " + DAO.usuarioLogin.getT().get(i).getTitulo());
                        System.out.println("\tStatus: " + DAO.usuarioLogin.getT().get(i).isStatus());
                    }
                    }
                        System.out.print("Digite o ID da tarefa que você deseja finalizar: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        if((id-1) < DAO.usuarioLogin.getT().size()){
                            DAO.usuarioLogin.endTarefa((id-1));
                        }else{
                            System.out.println("Tarefa não encontrada");
                        }
                        break;
                case "4":
                    for(int i = 0;i < DAO.usuarioLogin.getT().size();i++){
                        System.out.println("Tarefa " + (i+1));
                        System.out.println("\tTitulo: " + DAO.usuarioLogin.getT().get(i).getTitulo());
                        System.out.println("\tStatus: " + DAO.usuarioLogin.getT().get(i).isStatus());
                        }
                    System.out.print("Digite o ID da tarefa que você deseja finalizar: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        if((id-1) < DAO.usuarioLogin.getT().size()){
                            DAO.usuarioLogin.getT().remove((id-1));
                        }else{
                            System.out.println("Tarefa não encontrada");
                        }
                    break;
                case "5":
                    DAO.usuarioLogin = null;
                    break;    
            }
        }
    }
}  
    

