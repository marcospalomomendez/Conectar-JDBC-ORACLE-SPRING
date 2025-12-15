package com.dam.accesodatos.Conectar_JDBC_ORACLE_SPRING;

import com.dam.accesodatos.Conectar_JDBC_ORACLE_SPRING.model.Alumno;
import com.dam.accesodatos.Conectar_JDBC_ORACLE_SPRING.service.AlumnoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class AlumnoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(AlumnoApplication.class, args);

        AlumnoService servicio = ctx.getBean(AlumnoService.class);

        List<Alumno> alumnos = servicio.obtenerAlumnos();

        alumnos.forEach(System.out::println);
    }
}
