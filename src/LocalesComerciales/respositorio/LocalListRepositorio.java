package LocalesComerciales.respositorio;

import LocalesComerciales.modelo.Local;

import java.util.ArrayList;
import java.util.List;

public class LocalListRepositorio implements CrudRepositorio {

    private List<Local> dataSource;

    public LocalListRepositorio() {
        this.dataSource = new ArrayList<>();
    }
    @Override
    public List<Local> listar() {
        return dataSource;
    }

    @Override
    public Local porId(Integer id) {
        Local resultado = null;
        for(Local mas: dataSource){
            if(mas.getId() != null && mas.getId().equals(id)){
                resultado = mas;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Local local) {
        this.dataSource.add(local);
    }

    @Override
    public void editar(Local local) {
        Local m = this.porId(local.getId());
        m.setNombreMascota(local.getNombre());
        m.setRaza(local.getRaza());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }
    @Override
    public int total() {
        return this.dataSource.size();
    }
}
