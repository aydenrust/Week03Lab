/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 795347
 */
public class NoteServlet extends HttpServlet {
   


    

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String edit = request.getParameter("edit");
        
       
     
       
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        int check = 0;
        String title = "";
        String contents = "";
        String line;
        while((line = br.readLine()) != null){
            if(check == 0){
                check++;
                title = line;
            }else{
                //read content
                contents = contents + line;
            }
        }

        request.setAttribute("title", title);
        request.setAttribute("contents", contents);
        if(edit != null){
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }else{
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
       
       }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

}
