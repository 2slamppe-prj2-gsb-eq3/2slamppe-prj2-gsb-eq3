package controleur;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * GSB
 *
 * @version v2 21 novembre 2013
 * @author bdixneuf Objectif : - exemple de dynamique Vue/Controleur avec
 * controleur principal - exemple de pattern Dao - exemple de singleton de
 * connexion à un SGBD - exemple de paramétrage utilisant un fichier de
 * "properties"
 */
public class Main {

    /**
     * Main
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CtrlPrincipal ctrlPrincipal; // référence vers le contrôleur principal

        // Pour lancer l'application, instancier le contrôleur principal
        ctrlPrincipal = new CtrlPrincipal();
        ctrlPrincipal.action();
    }
}
