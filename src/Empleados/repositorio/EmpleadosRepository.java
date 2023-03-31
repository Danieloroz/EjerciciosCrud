package Empleados.repositorio;

import Empleados.modelo.Empleados;

import java.util.List;

public interface EmpleadosRepository {
    Empleados findById(int id);
    List<Empleados> findAll();
    void save(Empleados empleados);
    void update(Empleados empleados);
    void delete(Empleados empleados);
}
