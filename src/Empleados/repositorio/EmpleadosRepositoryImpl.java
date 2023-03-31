package Empleados.repositorio;

import Empleados.modelo.Empleados;

import java.util.ArrayList;
import java.util.List;

public class EmpleadosRepositoryImpl implements EmpleadosRepository {
    private List<Empleados> empleados;

    public EmpleadosRepositoryImpl() {
        empleados = new ArrayList<>();
    }

    @Override
    public Empleados findById(int id) {
        return empleados.stream()
                .filter(empleados -> empleados.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Empleados> findAll() {
        return empleados;
    }

    @Override
    public void save(Empleados empleados) {
        this.empleados.add(empleados);
    }

    @Override
    public void update(Empleados empleados) {
        Empleados oldEmpleados = findById(empleados.getId());
        if (oldEmpleados != null) {
            this.empleados.remove(oldEmpleados);
            this.empleados.add(empleados);
        }
    }

    @Override
    public void delete(Empleados empleados) {
        this.empleados.remove(empleados);
    }
}

