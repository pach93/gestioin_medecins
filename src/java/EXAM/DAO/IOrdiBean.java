/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXAM.DAO;

import EXAM.bean.Ordinateur;
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
public class IOrdiBean implements IOrdi{
    
    @PersistenceContext
    EntityManager em;

    @Override
    public void AddOrdi(Ordinateur ordi) {
       try {
          

            em.persist(ordi);
        } catch (Exception e) {
            try {
              
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Ordinateur> getAll() {
       Query query = em.createQuery("SELECT o FROM Ordinateur o");

    try {
            List<Ordinateur> listOrd = query.getResultList();
           
            return listOrd;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    }

   

   

