package com.example.demo1;

import java.io.*;
import javax.servlet.*;

public class First implements Servlet{
    ServletConfig config=null;

    public void init(ServletConfig config){
        this.config=config;
        System.out.println("servlet is initialized");
    }

    public void service(ServletRequest req,ServletResponse res)  throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.print("");
        out.print("hello simple servlet");
        out.print("");
    }

    public void destroy(){
        System.out.println("servlet is destroyed");
    }

    public ServletConfig getServletConfig(){
        return config;
    }

    public String getServletInfo(){
        return "copyright 2007-1010";
    }
}