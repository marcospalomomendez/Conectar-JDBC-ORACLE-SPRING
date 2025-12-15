package com.dam.accesodatos.Conectar_JDBC_ORACLE_SPRING.service;

import com.dam.accesodatos.Conectar_JDBC_ORACLE_SPRING.model.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Alumno> obtenerAlumnos() {

        String sql = "SELECT nombre, curso FROM ALUMNO";

        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Alumno(
                        rs.getString("nombre"),
                        rs.getString("curso")
                )
        );
    }


    private Alumno mapAlumno(ResultSet rs) throws SQLException {

        return new Alumno(
                rs.getString("nombre"),
                rs.getString("curso")
        );
    }
}
