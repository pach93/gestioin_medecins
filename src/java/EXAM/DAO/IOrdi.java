/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXAM.DAO;

import EXAM.bean.Ordinateur;
import java.util.List;

/**
 *
 * @author DIOUF ABBAS
 */
public interface IOrdi {
    
    public void AddOrdi(Ordinateur ordi);
    public List<Ordinateur> getAll();
}
