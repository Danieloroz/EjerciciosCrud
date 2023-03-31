package Empleados.modelo;

public class Empleados {
    public Integer Id;
    private String nombre;
    private String categoria;


    public Empleados(Integer id, String nombre, String categoria) {
        Id = id;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombreProducto() {
        return nombre;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
