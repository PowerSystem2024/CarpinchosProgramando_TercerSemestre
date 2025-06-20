-- Comenzamos con CRUD: create(insertar), read(leer), update(actualizar), delete(eliminar)
-- Listar los estudiantes (read)
SELECT * FROM public."Estudiantes2025";

-- Insertar estudiante
INSERT INTO public."Estudiantes2025" (nombre, apellido, telefono, mail) VALUES ('Juan', 'Perez', '2614545456', 'juan@mail.com');

-- Update (modificar)
UPDATE public."Estudiantes2025" SET nombre='Juan Carlos', apellido='Garcia', mail='juajd@gmail.com' WHERE id_estudiantes2025= 1;

-- Delete(eliminar)
DELETE FROM public."Estudiantes2025" WHERE id_estudiantes2025=3;

-- Para modificar el id_estudiantes2025 y comience en 1
