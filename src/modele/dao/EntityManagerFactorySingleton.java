/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modele.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author btssio
 */
public class EntityManagerFactorySingleton {
    
    private static EntityManagerFactory singleton = null;
    
    private EntityManagerFactorySingleton() {
    }
    
    public static synchronized EntityManagerFactory getInstance() {
        if (singleton == null) {
            singleton = Persistence.createEntityManagerFactory("persistence");
        }
        return singleton;
    }
    
}
