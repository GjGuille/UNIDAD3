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
import utng.datos.CineDAO;
import utng.modelo.Pelicula;
import utng.modelo.Cine;
/**
 *
 * @author Guillermo
 */
@ManagedBean (name = "cineBean") @SessionScoped
public class CineBean implements Serializable{

    private List<Cine>cines;
    private Cine cine;
    private List<Pelicula> peliculas;
    public CineBean(){
        cine = new Cine();
        cine.setPelicula(new Pelicula());
    }

    public List<Cine> getCines() {
        return cines;
    }

    public void setCines(List<Cine> cines) {
        this.cines = cines;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    
    public String listar(){
        CineDAO dao = new CineDAO();
        try{
            cines = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Cines";
    }
    public String eliminar(){
         CineDAO dao = new CineDAO();
        try{
            dao.delete(cine);
            cines = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Eliminar";
    }
    public String iniciar(){
        cine = new Cine();
        cine.setPelicula(new Pelicula());
        try{
            peliculas = new PeliculaDAO().getAll();
        }catch(Exception e){
            e.printStackTrace(); 
        } 
        return "Iniciar";
    }
    public String guardar(){
        CineDAO dao = new CineDAO();
        try{
            if(cine.getIdCine()!=0){
                dao.update(cine);
            }else{
                dao.insert(cine);
            }
            cines = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Cine cine){
        this.cine = cine;
        try{
            peliculas = new PeliculaDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Editar";
    }
    
}