package com.ojiraphers.section02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

public class ResponseHeaderPrintServlet extends HttpServlet {


@WebServlet("/respunse-print")
public class RespunseHeaderPrintServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        long currentTime = System.currentTimeMillis();
        out.print("<h1>" + currentTime + "</h1>");
        out.close();

        Collection<String> responseHeaders = resp.getHeaderNames();
        Integer<String>  = ;

    }
}