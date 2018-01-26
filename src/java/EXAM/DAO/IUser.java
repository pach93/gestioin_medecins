/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXAM.DAO;

import EXAM.bean.Os;
import EXAM.bean.Utilisateur;
import java.util.List;

/**
 *
 * @author DIOUF ABBAS
 */
public interface IUser {
    
     public List<Utilisateur> getAllType();
     public Utilisateur findbyId(int id);
}
