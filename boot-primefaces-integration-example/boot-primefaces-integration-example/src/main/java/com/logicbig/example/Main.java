package com.logicbig.example;

import com.logicbig.example.data.Ideas;
import com.logicbig.example.data.IdeasService;
import com.logicbig.example.data.Users;
import com.logicbig.example.data.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;
import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class Main{
    @Autowired
    UserService userService;
    @Autowired
    IdeasService ideasService;

    public static void main (String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean(name = "database")
    public CommandLineRunner run() throws Exception {
        return (args) -> {
            System.out.println("Adding Configuration....\n");
            userService.addUser(new Users("Mpulido","lhanna.23","Mariana Pulido","proponente",20,"3002441258","mpm@gmail.com"));
<<<<<<< HEAD
            ideasService.addIdeas(new Ideas("Reciclaje","Campaña de nuevos metodos verdes", LocalDate.now(),"Mpulido","estudiante","Clasificacion de residuos","Ambiental"));
=======

>>>>>>> 0e3abdf2c285c4cb7c02f991849064cbabad9e05
            System.out.println("\nGetting all configs....");
            userService.getAllUsers().forEach(configuration -> System.out.println(configuration));
        };
    }

    @Bean
    @DependsOn({"database"})
    ServletRegistrationBean jsfServletRegistration (ServletContext servletContext) {
        //spring boot only works if this is set
        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());

        //registration
        ServletRegistrationBean srb = new ServletRegistrationBean();
        srb.setServlet(new FacesServlet());
        srb.setUrlMappings(Arrays.asList("*.xhtml"));
        srb.setLoadOnStartup(1);
        return srb;
    }
}