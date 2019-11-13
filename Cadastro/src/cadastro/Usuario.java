/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

/**
 *
 * @author Aluno03
 */
public class Usuario {
    private String email;
    private String senha;
        void atribuirEmail(String e1){
            email = e1;
        }
        void atribuirSenha(String s1){
            senha = s1;
        }
        String mostrarEmail(){
            return email;
        }
        String mostrarSenha(){
            return senha;
        }
}
