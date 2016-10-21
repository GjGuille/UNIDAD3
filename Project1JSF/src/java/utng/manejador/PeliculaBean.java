/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.PeliculaDAO;
import utng.modelo.Pelicula;

/**
 *
 * @author Guillermo
 */
@ManagedBean @SessionScoped
public class PeliculaBean implements Serializable{
    private List<Pelicula> cines;
    private Pelicula pelicula;
    
    public PeliculaBean(){
            // Todo Auto-generated constructor stub
    }

    public Pelicula getCine() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Pelicula> getCines() {
        return cines;
    }

    public void setPeliculas(List<Pelicula> cine) {
        this.pelicula = pelicula;
    }
    
    public String listar(){
            PeliculaDAO dao = new PeliculaDAO();
            try {
                cines = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
            return "Cines";
    }
    public String eliminar(){
        PeliculaDAO dao = new PeliculaDAO();
        try {
                dao.delete(pelicula);
                cines = dao.getAll();
        } catch (Exception e) {
                e.printStackTrace();
        }
        return "Eliminar";
    }
    public String  iniciar(){
            pelicula = new Pelicula();
            return "Iniciar";
    }
    
    public String guardar () {
    PeliculaDAO dao = new PeliculaDAO();
        try {
                if(pelicula.getIdPelicula()!=0){
                        dao.update(pelicula);
                }else{
                    dao.insert(pelicula);
                }
                cines = dao.getAll();
        } catch (Exception e) {
                e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
            return "Cancelar";
    }
    public  String editar(Pelicula pelicula){
        this.pelicula = pelicula;
        return "Editar";
    }
    
}

