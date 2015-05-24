/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author btssio
 */
public class EntityManagerFactorySingleton {

    private static EntityManagerFactory singleton = null;

    private EntityManagerFactorySingleton() {
    }

    public static synchronized EntityManagerFactory getInstance() {
        /*if (singleton == null) {
         singleton = Persistence.createEntityManagerFactory("persistence");
            
         }*/

        try {
            Properties data;                              // objet de propriétés (paramètres de l'appplication) pour Jdbc
            FileInputStream input;                                  // flux de lecture des properties
            // Chargement des paramètres du fichier de properties
            data = new Properties();
            input = new FileInputStream("config.properties");
            data.load(input);
            input.close();
            System.out.println(data);
            Map properties = new HashMap();
            properties.put("javax.persistence.jdbc.url", data.getProperty("url"));
            properties.put("javax.persistence.jdbc.password", data.getProperty("password"));
            properties.put("javax.persistence.jdbc.driver", data.getProperty("driver"));
            properties.put("javax.persistence.jdbc.user", data.getProperty("user"));

            try {
                singleton = Persistence.createEntityManagerFactory("persistence", properties);
            } catch (Exception ef) {
                JOptionPane.showMessageDialog(null, ef.getMessage(), "Lanceur Main - Données d'accès Database erronnée", JOptionPane.ERROR_MESSAGE);                
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Lanceur Main - Fichier de propriétés introuvable", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Lanceur Main - Erreur lors du chargement du fichier de propriétés", JOptionPane.ERROR_MESSAGE);
        }

        return singleton;
    }

}
