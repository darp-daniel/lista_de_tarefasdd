/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.TarefaDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Tarefas;
import model.Usuario;

/**
 *
 * @author Aluno03
 */
@WebServlet(name = "ExcluirServlet", urlPatterns = {"/excluir"})
public class ExcluirServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Usuario u = (Usuario) session.getAttribute("usuarioLogado");
        int id = u.getId();
        
        ArrayList<Tarefas> tarefas = TarefaDAO.buscarById(id);
        
        request.setAttribute(, u);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Usuario u = (Usuario) session.getAttribute("usuarioLogado");
        int id = u.getId();
        String titulo = request.getParameter("titulo");
        
        boolean sucesso = TarefaDAO.excluirTarefa(titulo, id);
        
        if(sucesso){
            request.setAttribute("msg", "Tarefa excluída com sucesso");
            response.sendRedirect("WEB-INF/excluir");
        }else{
            request.setAttribute("erro", "Ocorreu um erro tente novamente!!");
            response.sendRedirect("WEB-INF/excluir");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
