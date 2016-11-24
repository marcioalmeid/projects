/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lsi.mam.jpomodairo.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author marcioam
 */
public enum PersistenceManager {
    INSTANCE;
    
    private EntityManagerFactory emFactory;
    
    private PersistenceManager(){
      emFactory = Persistence.createEntityManagerFactory("br.lsi.mam_jpomodairo_jar_1.0-SNAPSHOTPU");      
    }
    
    public EntityManager getEntityManager(){
        return emFactory.createEntityManager();
    }
    
    public void close(){
        emFactory.close();
    }
}
