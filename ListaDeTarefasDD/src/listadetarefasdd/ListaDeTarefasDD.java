/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadetarefasdd;

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
                            u.setEmail(email);
                            u.setSenha(senha);
                            DAO.addUsuario(u);
                            break;
                        case "2":
                            boolean achou = false;
                            System.out.print("Digite o email: ");
                            email = sc.nextLine();
                            System.out.print("Digite a senha: ");
                            senha = sc.nextLine();
                            DAO.srcUEmail(email);
                            for(int i = 0;i < DAO.us.size();i++){
                                if(senha.equals(DAO.us.get(i).getSenha())){
                                    DAO.usuarioLogin = DAO.us.get(i);
                                    achou = true;
                                    break;
                                }
                                }
                            if(achou){
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
        String id;
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
                    Usuario.addTarefa(t);
                    break;
                case "2":
                    for(int i = 0;i < Usuario.ts.size();i++){
                        System.out.println("Tarefa " + Usuario.ts.get((i+1)));
                        System.out.println("\tTitulo: " + Usuario.ts.get(i).getTitulo());
                        System.out.println("\tStatus: " + Usuario.ts.get(i).isStatus());
                    }
                    break;
                case "3":
                    for(int i = 0;i < Usuario.ts.size();i++){
                        if(Usuario.ts.get(i).isStatus() == false){
                        System.out.println("Tarefa " + Usuario.ts.get((i+1)));
                        System.out.println("\tTitulo: " + Usuario.ts.get(i).getTitulo());
                        System.out.println("\tStatus: " + Usuario.ts.get(i).isStatus());
                    }
                        System.out.print("Digite a Tarefa que você deseja finalizar: ");
                        id = sc.nextLine();
                        if(id.equals((i-1))){
                            
                        }
                    }
                    break;
                case "4":
                    break;
                case "5":
                    break;    
            }
        }
    }
}  
    

