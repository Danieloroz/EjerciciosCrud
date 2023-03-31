package LocalesComerciales;

import LocalesComerciales.modelo.Local;
import LocalesComerciales.respositorio.CrudRepositorio;
import LocalesComerciales.respositorio.LocalListRepositorio;

import java.util.List;
import java.util.Scanner;

public class VistaPrincipal {

    public static void main(String[] args) {
        String opc = "1";
        CrudRepositorio repo = new LocalListRepositorio();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar \n 5. Contar \n 6. Salir \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Ingrese nombre: ");
                    String nom = s.next();
                    System.out.println("ingrese direccion: ");
                    String raza = s.next();
                    repo.crear(new Local(nom, raza));
                    break;
                }
                case "2": {
                    List<Local> locals = repo.listar();
                    locals.forEach(System.out::println);
                    break;
                }
                  case "3": {
                    System.out.println("===== editar ====");
                    System.out.print("ingrese id del registro Local: ");
                    Integer i = s.nextInt();
                    System.out.print("ingrese nombre: ");
                    String nom = s.next();
                    System.out.print("ingrese Direccion: ");
                    String dir = s.next();
                    Local beaActualizar = new Local(nom, dir);
                    beaActualizar.setId(i);
                    repo.editar(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("ingrese id del registro: ");
                    Integer id = s.nextInt();
                    repo.eliminar(id);
                    repo.listar().forEach(System.out::println);
                    break;
                }
                case "5": {
                    System.out.println("===== total ===== ");
                    System.out.print("Total registros: " + repo.total());
                    break;
                }
                case "6": {
                    opc = "6";
                    break;
                }
            }
        } while (opc != "6");
    }
    }


