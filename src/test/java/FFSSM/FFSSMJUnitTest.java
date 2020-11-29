/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FFSSM;

import java.time.LocalDate;
import java.time.Month;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * @author leand
 */
public class FFSSMJUnitTest {
    
    /**
     *
     */
    public FFSSMJUnitTest() {
    }
    
    private Personne personne1;
    private Personne personne2;
    private Plongeur plongeur1;
    private Plongeur plongeur2;
    private Moniteur m1;
    private Moniteur m2;
    private Club c1;
    private Site s1;
    private Plongee p;
    private LocalDate date;
    
    private Licence l1;
    private Licence l2;
    
    @BeforeEach
    public void setUp() {
        
        date=LocalDate.of(2020,11,25);
        
        personne1= new Personne("10","Garriga","Léandre","81100 Castres","0600000000",LocalDate.of(1999,03,29));
        personne2= new Personne("08","Némar","Jean","81100 Castres","0600000001",LocalDate.of(1969,12,13));
        
        plongeur1= new Plongeur("10","Garriga","Léandre","81100 Castres","0600000000",LocalDate.of(2019,03,29),1);
        plongeur1.ajouteLicence("01", date);
        
        plongeur2= new Plongeur("10","Némar","Jean","81100 Castres","0600000001",LocalDate.of(2019,12,13),3);
        
        m1= new Moniteur("10","Némar","Jean","81100 Castres","0600000001",LocalDate.of(2019,12,13),3,1);
        m2= new Moniteur("10","Garriga","Léandre","81100 Castres","0600000000",LocalDate.of(2019,03,29),1,2);
        
        c1= new Club(m1,"ClubPlongee","0400000000","81100 Castres");
        
        s1=new Site("Palavas-les-flots","Profondeur");
        
        p=new Plongee(s1,m1,date,30,2);
        
        l1= new Licence(personne1, "01",LocalDate.of(2019,03,29),c1);
        l2= new Licence(personne2,"02",LocalDate.of(2019,12,13),c1);
        
    }
    
    @Test
    public void testLicenceValide() {
	assertFalse(l1.estValide(date));    //La licence l1 ne doit pas etre valide
        assertTrue(l2.estValide(date));  //La licence l2 doit etre valide
	}
    
    @Test
    public void testLicenceGetPossesseur(){
        assertEquals(l1.getPossesseur(),personne1,"La methode est sensée renvoyé personne1");
    }
    
    @Test
    public void testLicenceGetNumero(){
        assertEquals("01",l1.getNumero(),"La méthode est sensée renvoyé '01'");
    }
    
    @Test
    public void testLicenceGetDelivrance(){
        assertEquals(LocalDate.of(2019, 03, 29),l1.getDelivrance(),"La méthode est sensée renvoyé '2019/03/29'");
    }
    
    @Test
    public void testLicenceGetClub(){
        assertEquals(c1,l1.getClub(),"La méthode est sensée renvoyé 'c1'");
    }
    
    //-------------------------------------------------------------------------
    
    @Test
    public void testPlongeurGetNumero(){
        assertEquals("01",plongeur1.getNumero());
    }
    
    @Test
    public void testPlongeurGetDelivrance(){
        assertEquals(date,plongeur1.getDelivrance());
    }
    
    //-------------------------------------------------------------------------
    
    @Test
    public void testPersonneGetNumeroINSEE(){
        assertEquals("10",personne1.getNumeroINSEE());
    }
    
    @Test
    public void testPersonneSetNom(){
        personne1.setNom("Feron");
        assertEquals("Feron",personne1.nom);
    }
    
    @Test
    public void testPersonneGetNom(){
        assertEquals("Garriga",personne1.getNom());
    }
    
    @Test
    public void testPersonneSetPrenom(){
        personne1.setPrenom("Theo");
        assertEquals("Theo",personne1.prenom);
    }
    
    @Test
    public void testPersonneGetPrenom(){
        assertEquals("Léandre",personne1.getPrenom());
    }
    
    @Test
    public void testPersonneSetAdresse(){
        personne1.setAdresse("34070 Montpellier");
        assertEquals("34070 Montpellier",personne1.getAdresse());
    }
    
    @Test
    public void testPersonneGetAdresse(){
        assertEquals("81100 Castres",personne1.getAdresse());
    }
    
    @Test
    public void testPersonneSetTelephone(){
        personne1.setTelephone("118218");
        assertEquals("118218",personne1.getTelephone());
    }
    
    @Test
    public void testPersonneGetTelephone(){
        assertEquals("0600000001",personne2.getTelephone());
    }
    
    @Test
    public void testPersonneSetNaissance(){
        personne1.setNaissance(LocalDate.of(1959, 06, 22));
        assertEquals(LocalDate.of(1959, 06, 22),personne1.naissance);
    }
    
    @Test
    public void testPersonneGetNaissance(){
        assertEquals(LocalDate.of(1969,12,13),personne2.getNaissance());
    }
    
    //-------------------------------------------------------------------------
    
    @Test
    public void testClubSetPresident(){
        c1.setPresident(m2);
        assertEquals(m2,c1.president);
    }
    
    @Test
    public void testClubGetPresident(){
        assertEquals(m1,c1.getPresident());
    }
    
    @Test
    public void testClubSetNom(){
        c1.setNom("PlongeeSousMarine");
        assertEquals("PlongeeSousMarine",c1.nom);
    }
    
    @Test
    public void testClubGetNom(){
        assertEquals("ClubPlongee",c1.getNom());
    }
    
    @Test
    public void testClubSetAdresse(){
        c1.setAdresse("34070 Montpellier");
        assertEquals("34070 Montpellier",c1.adresse);
    }
    
    @Test
    public void testClubGetAdresse(){
        assertEquals("81100 Castres",c1.getAdresse());
    }
    
    @Test
    public void testClubSetTelephone(){
        c1.setTelephone("0400112233");
        assertEquals("0400112233",c1.telephone);
    }
    
    @Test
    public void testClubGetTelephone(){
        assertEquals("0400000000",c1.getTelephone());
    }
    
    @Test
    public void testOrganisePlongee(){
        c1.organisePlongee(p);
        assertTrue(c1.plongee.contains(p));
    }
}
