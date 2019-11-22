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
public class DAO {
    private String email;
    private String senha;
    static ArrayList <Usuario> us = new ArrayList();
    static Usuario usuarioLogin = null;

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

    public ArrayList<Usuario> getU() {
        return us;
    }

    public void setU(ArrayList<Usuario> us) {
        this.us = us;
    }
    public static Usuario srcUEmail(String email){
        for(int i = 0; i < us.size();i++){
            if(email.equals(us.get(i).getEmail())){
                return us.get(i);
            }
            
        }
        return null;
    }
    public static void addUsuario(Usuario u){
        us.add(u);
    }
    
}
