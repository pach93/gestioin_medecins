/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXAM.ui;

import EXAM.DAO.IOrdi;
import EXAM.DAO.IUser;
import EXAM.DAO.Ios;
import EXAM.bean.Ordinateur;
import EXAM.bean.Os;
import EXAM.bean.Utilisateur;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DIOUF ABBAS
 */
@WebServlet(name = "OrdinateurServelet", urlPatterns = {"/Ordi"})
public class OrdinateurServelet extends HttpServlet {

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
            out.println("<title>Servlet OrdinateurServelet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OrdinateurServelet at " + request.getContextPath() + "</h1>");
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
     * 
     * 
     */
    
    @EJB
    private Ios iosEJB;
    @EJB
    private IUser iusEJB;
     @EJB
    private IOrdi iorEJB;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
              
                String action = request.getParameter("action");
           if (action == null) {
               getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
           } else if (action.equals("inscription")) {
               request.setAttribute("lesOs", iosEJB.getAllType());
               request.setAttribute("lesUs", iusEJB.getAllType());
               getServletContext().getRequestDispatcher("/AjoutOrdi.jsp").forward(request, response);
           }
        else if(action.equals("tous"))
        {
         List<Ordinateur> LesOr = iorEJB.getAll();
          request.setAttribute("lesOr", LesOr);
                getServletContext().getRequestDispatcher("/LesOrdis.jsp").forward(request, response);
         
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
     String ref = request.getParameter("ref");
     String mark = request.getParameter("mark");
     String disk = request.getParameter("disk") +"Go";
     String ram = request.getParameter("ram") +"Go";
     
     Os os = iosEJB.findByID(Integer.parseInt(request.getParameter("os")));
     Utilisateur us = iusEJB.findbyId(Integer.parseInt(request.getParameter("us")));
    
     
     
     Ordinateur ordi = new Ordinateur();
     ordi.setDisque(disk);
     ordi.setMarque(mark);
     ordi.setRam(ram);
     ordi.setReference(ref);
     ordi.setIdUser(us);
     ordi.setIdOs(os);
     
        try {
            iorEJB.AddOrdi(ordi);
           List<Ordinateur> LesOr = iorEJB.getAll();
            if (LesOr != null) {
                request.setAttribute("lesOr", LesOr);
                getServletContext().getRequestDispatcher("/LesOrdis.jsp").forward(request, response);
            }
        } catch (Exception e) {
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
