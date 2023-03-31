package Empleados;


import Empleados.modelo.Empleados;
import Empleados.repositorio.EmpleadosRepository;
import Empleados.repositorio.EmpleadosRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class PrincipalEmpleados {
    public static void main(String[] args) {
        String opc = "1";
        EmpleadosRepository repo = new EmpleadosRepositoryImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Id empleado: ");
                    Integer id = s.nextInt();
                    System.out.println("Nombre empleado: ");
                    String nom = s.next();
                    System.out.println("categoria: ");
                    String cat = s.next();
                    repo.save(new Empleados(id,nom, cat));
                    break;
                }
                case "2": {
                    List<Empleados> empleados = repo.findAll();
                    empleados.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("===== editar ====");
                    System.out.print("id  empleado: ");
                    Integer id = s.nextInt();
                    System.out.print("ingrese nombre: ");
                    String nom = s.next();
                    System.out.print("ingrese categoria: ");
                    String cat = s.next();
                    Empleados beaActualizar = new Empleados(id, nom, cat);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("ingrese id del registro: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (opc != "5");
    }
    }

