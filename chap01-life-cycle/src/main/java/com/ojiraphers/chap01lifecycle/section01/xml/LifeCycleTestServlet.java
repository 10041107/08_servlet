package com.ojiraphers.chap01lifecycle.section01.xml;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class LifeCycleTestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private int initCount =1;
    private int serviceCount =1;
    private int destroyCount = 1;

    public LifeCycleTestServlet() {
        System.out.println("start 값 : " + serialVersionUID);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("anoanoinitCount : " + initCount++);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("anoserviceCount : " + serviceCount++);
    }

    @Override
    public void destroy() {
        System.out.println("anodestroyCount : " + destroyCount++);
    }


}
