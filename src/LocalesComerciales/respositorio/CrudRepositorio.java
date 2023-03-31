package LocalesComerciales.respositorio;

import LocalesComerciales.modelo.Local;

import java.util.List;

public interface CrudRepositorio {
    List<Local> listar();
    Local porId(Integer id);
    void crear(Local local);
    void editar(Local local);
    void eliminar(Integer id);
    public int total();
}
