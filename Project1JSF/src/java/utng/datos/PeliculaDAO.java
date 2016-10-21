/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Pelicula;

/**
 *
 * @author Guillermo
 */
public class PeliculaDAO extends DAO<Pelicula>{
        
        public PeliculaDAO(){
                super(new Pelicula());
        }
        
        public Pelicula getOneById(Pelicula pelicula)
                        throws HibernateException {
                return super.getOneById(
                                pelicula.getIdPelicula());
        }
    
}
