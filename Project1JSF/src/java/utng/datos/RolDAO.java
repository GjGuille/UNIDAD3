/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

/**
 *
 * @author Guillermo
 */
import org.hibernate.HibernateException;
import utng.modelo.Rol;

public class RolDAO extends DAO<Rol>{
        
        public RolDAO(){
                super(new Rol());
        }
        
        public Rol getOneById(Rol rol)
                        throws HibernateException {
                return super.getOneById(
                                rol.getIdRol());
        }
    
}
