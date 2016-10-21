/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Guillermo
 */
@Entity @Table(name ="cine")
public class Cine implements Serializable{
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name ="id_cine")
        private Long idCine;
        @Column (name = "nombre_cine", length = 20)
        private String nombreCine;
        @Column (name= "direccion", length = 40) 
        private String direccion;
        @Column (name= "correo", length = 20) 
        private String correo;
        @ManyToOne()
        @JoinColumn(name = "id_pelicula")
        private Pelicula pelicula;
        public Cine (Long idcine,String nombreCine, String direccion,String correo, Pelicula cine){
                super();
                this.idCine= idCine;
                this.nombreCine = nombreCine;
                this.direccion = direccion;
                this.correo = correo;
                this.pelicula = cine;
        }

    
    public Cine() {
     this.idCine=0L;
     
    }

    public Long getIdCine() {
        return idCine;
    }

    public void setIdCine(Long idCine) {
        this.idCine = idCine;
    }

    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

   
  
    
}

