/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class FirstServlet implements Servlet {
    
    //Life Cycle method
    
    ServletConfig conf;
    @Override
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.print("Creating object........");
    }
    
    
    @Override
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException {
        
        System.out.println("Serving..........");
        
        
        // Set The Content Type of the response
        
        resp.setContentType("text/html");
        PrintWriter  out = resp.getWriter();
        out.println("<h1>This is my output from servlet method </h1>");
        out.println("<h1> Todays Date and Time is "+new Date().toString()+"</h1>");
        
    
    }
    @Override
    public void destroy(){
        
        System.out.println("Going to destroy..........Servlet Object");
    
    
    }
    
    
    // Non Life Cycle Methods 
    @Override
    public ServletConfig getServletConfig(){
        return this.conf;
    
    
    
    }
    
    public String getServletInfo(){
    
        return "This servlet is created by smahli";
    }
     
    
}
