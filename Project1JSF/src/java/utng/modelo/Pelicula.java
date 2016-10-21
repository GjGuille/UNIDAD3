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
import javax.persistence.Table;

/**
 *
 * @author Guillermo
 */
@Entity @Table(name="pelicula")
public class Pelicula implements Serializable{
        @Id
        @GeneratedValue(
                        strategy = GenerationType.IDENTITY)
        @Column(name="id_pelicula")
        private Long idPelicula;
        @Column(length = 30)
        private String nombre;
        @Column(length = 30)
        private String clasificacion;
        @Column(length = 30)
        private int entrada;
        
        
        public Pelicula() {
                this.idPelicula = 0L;
        }

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    
        
}

