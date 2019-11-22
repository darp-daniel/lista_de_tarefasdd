/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadetarefasdd;

import java.util.ArrayList;

/**
 *
 * @author Aluno03
 */
public class Usuario {
    String email;
    String senha;
    static ArrayList <Tarefas> ts = new ArrayList(); 

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Tarefas> getT() {
        return ts;
    }

    public void setT(ArrayList<Tarefas> ts) {
        Usuario.ts = ts;
    }
    public static void addTarefa(Tarefas t){
        ts.add(t);
    }
    public static void endTarefa(){
        
   }
}
