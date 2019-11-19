/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroProduto;

/**
 *
 * @author Aluno03
 */
public class Produto {
    private String nome;
    private String codigo;
    private int estoque;
    private float preço;
        public void setNome(String n1){
            nome = n1;
        }
        public void setCodigo(String c1){
            codigo = c1;
        }
        public void setEstoque(int e1){
            estoque = e1;
        }
        public void setPreço(float p1){
            preço = p1;
        }
        public String getNome(){
            return nome;
        }
        public String getCodigo(){
            return codigo;
        }
        public int getEstoque(){
            return estoque;
        }
        public float getPreço(){
            return preço;
        }
    
}
