/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresas.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author italo
 */
@WebServlet(name = "inicio", urlPatterns = {"/inicio"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        //processRequest(request, response);
        String boton_promedio = request.getParameter("promedio");
        String boton_consulta = request.getParameter("consulta");      
        modeloConsulta consulta = new modeloConsulta();
       
        
        
          if(boton_promedio != null){
            String ano_pro = request.getParameter("promedio");
            int ano_prom = Integer.parseInt(ano_pro);       
        double consul = consulta.getPromedio(ano_prom);  
        
        
      consulta.cerrar_conexion(); 
        request.setAttribute("promedio", consul);
          request.getRequestDispatcher("VistaProm.jsp").forward(request, response);
        }
    
           
    if(boton_consulta != null){
        ControlerTabla tabla = new ControlerTabla();
        ArrayList<ControlerTabla> Tabla = consulta.tablaTotal();
        
       
        String html ="";        
         for(ControlerTabla tabla_bd: Tabla){
                html += "<tr>";
                html += "<td>"+tabla_bd.getN()+"</td>";
                html += "<td>"+tabla_bd.getNombre()+"</td>";
                html += "<td>"+tabla_bd.getA2005()+"</td>";
                html += "<td>"+tabla_bd.getA2006()+"</td>";
                html += "<td>"+tabla_bd.getA2007()+"</td>";
                html += "<td>"+tabla_bd.getA2008()+"</td>";
                html += "<td>"+tabla_bd.getA2009()+"</td>";
                html += "<td>"+tabla_bd.getA2010()+"</td>";
                html += "<td>"+tabla_bd.getA2011()+"</td>";
                html += "<td>"+tabla_bd.getA2012()+"</td>";
                html += "<td>"+tabla_bd.getA2013()+"</td>";
                html += "<td>"+tabla_bd.getA2014()+"</td>";
                html += "<td>"+tabla_bd.getA2015()+"</td>";
                html += "</tr>";            
                
                      consulta.cerrar_conexion(); 

            }
         
                 request.setAttribute("N", tabla.getN());
                 request.setAttribute("Nombre", tabla.getNombre());
                 request.setAttribute("2005", tabla.getA2005());
                 request.setAttribute("2006", tabla.getA2006());
                 request.setAttribute("2007", tabla.getA2007());
                 request.setAttribute("2008", tabla.getA2008());
                 request.setAttribute("2009", tabla.getA2009());
                 request.setAttribute("2010", tabla.getA2010());
                 request.setAttribute("2011", tabla.getA2011());
                 request.setAttribute("2012", tabla.getA2012());
                 request.setAttribute("2013", tabla.getA2013());
                 request.setAttribute("2014", tabla.getA2014());
                 request.setAttribute("2015", tabla.getA2015());
                 
                 request.getRequestDispatcher("TablaJsp.jsp").forward(request, response);               


        }
         
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
        processRequest(request, response);
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
