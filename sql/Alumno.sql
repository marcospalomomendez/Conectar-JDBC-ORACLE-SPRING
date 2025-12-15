------------------------------------------------
-- TIPO tAlumno
------------------------------------------------
CREATE OR REPLACE TYPE tAlumno AS OBJECT (
    nombre VARCHAR2(50),
    curso  VARCHAR2(10)
);
/

------------------------------------------------
-- TABLA ALUMNO
------------------------------------------------
CREATE TABLE ALUMNO OF tAlumno;

------------------------------------------------
-- INSERT ALUMNO
------------------------------------------------
INSERT INTO ALUMNO VALUES (
                              'Marcos Palomo Méndez',
                              '2DAM'
                          );
