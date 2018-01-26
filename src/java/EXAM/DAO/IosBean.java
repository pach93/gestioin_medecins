/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXAM.DAO;

import EXAM.bean.Os;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author DIOUF ABBAS
 */
@Stateless
public class IosBean implements Ios{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Os> getAllType() {
        
        Query query = em.createQuery("SELECT o FROM Os o");

    try {
            List<Os> listOs = query.getResultList();
           
            return listOs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Os findByID(int id) {
        return em.find(Os.class, id);
    }
}
