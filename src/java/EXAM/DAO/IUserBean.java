/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXAM.DAO;

import EXAM.bean.Os;
import EXAM.bean.Utilisateur;
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
public class IUserBean implements IUser{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Utilisateur> getAllType() {
         Query query = em.createQuery("SELECT u FROM Utilisateur u");

    try {
            List<Utilisateur> listUs = query.getResultList();
           
            return listUs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Utilisateur findbyId(int id) {
        
        return em.find(Utilisateur.class, id);
    
    }
}
