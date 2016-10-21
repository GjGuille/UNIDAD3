/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Cine;

/**
 *
 * @author Guillermo
 */
public class CineDAO extends DAO<Cine>{
   
    public CineDAO(){
        super(new Cine());
    }
    public Cine getOneById(Cine cine) 
            throws HibernateException{
        return super.getOneById(cine.getIdCine());        
    }
    
}
