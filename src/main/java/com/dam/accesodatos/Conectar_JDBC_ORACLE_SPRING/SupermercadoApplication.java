package com.dam.accesodatos.Conectar_JDBC_ORACLE_SPRING;


import com.dam.accesodatos.Conectar_JDBC_ORACLE_SPRING.model.Producto;
import com.dam.accesodatos.Conectar_JDBC_ORACLE_SPRING.service.ProductoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SupermercadoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SupermercadoApplication.class, args);
        ProductoService servicio = ctx.getBean(ProductoService.class);
        List<Producto> productos = servicio.obtenerProductos();
        productos.forEach(System.out::println);
    }
}
