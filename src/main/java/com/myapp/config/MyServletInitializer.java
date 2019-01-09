package com.myapp.config;


import com.myapp.MyServlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyServletInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic myServler=
                servletContext.addServlet("myServler", MyServlet.class);
        myServler.addMapping("/custom/**");
    }
}
