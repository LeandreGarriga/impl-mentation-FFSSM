/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Moniteur extends Plongeur {
    

    public int numeroDiplome;
    HashMap<Club,LocalDate> emplois = new HashMap<>();

    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance,int niveau, int numeroDiplome) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance, niveau);
        this.numeroDiplome = numeroDiplome; 
    }

    /**
     * Si ce moniteur n'a pas d'embauche, ou si sa dernière embauche est terminée,
     * ce moniteur n'a pas d'employeur.
     * @return l'employeur actuel de ce moniteur sous la forme d'un Optional
     */
    public Optional<Club> employeurActuel() {
         // TODO: Implémenter cette méthode
         // ???
        throw new UnsupportedOperationException("Pas encore implémenté");
    }
    
    /**
     * Enregistrer une nouvelle embauche pour cet employeur
     * @param employeur le club employeur
     * @param debutNouvelle la date de début de l'embauche
     */
    public void nouvelleEmbauche(Club employeur, LocalDate debutNouvelle) {   
         // TODO: Implémenter cette méthode
         emplois.put(employeur, debutNouvelle);
         System.out.println("Nouvelle emplois au "+employeur.nom+" le "+ debutNouvelle);
        //throw new UnsupportedOperationException("Pas encore implémenté");	    
    }

    public List<Embauche> emplois() {
         // TODO: Implémenter cette méthode
         for(Club i : emplois.keySet()){
                System.out.println("Employé au"+emplois.get(i.nom));
         }
        throw new UnsupportedOperationException("Pas encore implémenté");
    }

}
