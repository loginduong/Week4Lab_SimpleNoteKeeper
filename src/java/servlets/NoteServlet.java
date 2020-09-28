/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 760483
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        try {
            String fileLoc = getServletContext().getRealPath("/WEB-INF/note.txt");
            BufferedReader br = new BufferedReader(new FileReader(new File(fileLoc)));
            Note readNote = new Note(br.readLine(), br.readLine());
            request.setAttribute("readNote", readNote);
            
        } catch (IOException e) {
           
        }
        
        
        String edit = request.getParameter("edit");
        if (edit != null) {
            request.getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);
            
        } else {
            request.getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
        }
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fileLoc = getServletContext().getRealPath("/WEB-INF/note.txt");
   
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileLoc, false)))) {
            pw.println(request.getParameter("editTitle"));
            pw.flush();
            pw.println(request.getParameter("editContent"));
            pw.flush();
        } catch (IOException e) {
            
        }
        
        this.doGet(request, response);
    }

    

}
