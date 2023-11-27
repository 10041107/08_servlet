package com.ojiraphers.section01.exception;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
/* javax.servlet.forward.request_uri
 * javax.servlet.forward.context_path
 * javax.servlet.forward.servlet_path
 * javax.servlet.forward.mapping
 * javax.servlet.error.status_code
 * javax.servlet.error.message
 * javax.servlet.error.servlet_name
 * javax.servlet.error.request_uri
 * */
public class ExceptionHandlerServlet extends HttpServlet{
        HttpServletRequest req;
        Enumeration <

                //java.servlet.forward.request_url
        String forwardRequestURL = (String) req.getAttribute("javax.servlet.forward.request_url");
        String contextPath = (String) req.getAttribute("javax.servlet.forward.context_path");
        String sevletPath = (String) req.getAttribute("javax.servlet.forward.request_url");
        HttpServletMapping mapping = req.getHttpServletMapping();
        Integer statusCode = (Integer) req.getAttribute("javax.servlet.forward.status_code");
        String message = (String) req.getAttribute("javax.servlet.forward.message");
        String sevletName = (String) req.getAttribute("javax.servlet.forward.sevlet_name");
        String errorRequestURI = (String) req.getAttribute("javax.servlet.forward.error.Request_uri");

        System.out.println(forwardRequestURL);

        StringBuilder errorPage = new StringBuilder();
        errorPage.append("<!doctype html> \n")
                .append("<html> \n")
                .append("<head> \n")
                .append("<title>에러화면</title> \n")
                .append("</head> \n")
                .append("<body> \n")
                .append("<h1> \n")
                .append(statusCode)
                .append("-")
                .append(message)
                .append("</h1> \n")
                .append("</body> \n")
                .append("</html> \n");









    }



