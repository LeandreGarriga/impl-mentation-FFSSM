package FFSSM;

import java.time.LocalDate;


public class Plongeur extends Personne {
    
    public int niveau;
    
    public String num;
    
    public LocalDate delivrance;
    

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance, int niveau){
	super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau=niveau;
    }
    
    public void ajouteLicence(String numero, LocalDate delivrance){
        this.num = numero;
        this.delivrance = delivrance;
    }
    
    public String getNumero(){
        return num;
    }
    
    public LocalDate getDelivrance(){
        return delivrance;
    }
}