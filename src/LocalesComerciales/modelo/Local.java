package LocalesComerciales.modelo;

public class Local {
    private Integer id;
    private String Nombre;
    private String Direccion;
    private static int ultimoId;

    public Local() {
        this.id = ++ultimoId;
    }

    public Local(String nombre, String direccion) {
        this();
        Nombre = nombre;
        Direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombreMascota(String nombre) {
        Nombre = nombre;
    }

    public String getRaza() {
        return Direccion;
    }

    public void setRaza(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }
}
