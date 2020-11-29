/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FFSSM;

import java.time.LocalDate;
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
    private Club c1;
    private LocalDate date;
    
    private Licence l1;
    private Licence l2;
    
    @BeforeEach
    public void setUp() {
        personne1= new Personne("10","Garriga","Léandre","81100 Castres","0600000000",LocalDate.of(1999,03,29));
        personne2= new Personne("10","Némar","Jean","81100 Castres","0600000001",LocalDate.of(1969,12,13));
        
        plongeur1= new Plongeur("10","Garriga","Léandre","81100 Castres","0600000000",LocalDate.of(2019,03,29),1);
        plongeur2= new Plongeur("10","Némar","Jean","81100 Castres","0600000001",LocalDate.of(2019,12,13),3);
        
        m1= new Moniteur("10","Némar","Jean","81100 Castres","0600000001",LocalDate.of(2019,12,13),3,1);
        
        c1= new Club(m1,"ClubPlongee","0400000000");
        
        l1= new Licence(personne1, "01",LocalDate.of(2019,03,29),c1);
        l2= new Licence(personne2,"02",LocalDate.of(2019,12,13),c1);
        
        date=LocalDate.of(2020,11,25);
    }
    
    @Test
    public void testLicenceValide() {
	assertFalse(l1.estValide(date));    //La licence l1 ne doit pas etre valide
        assertTrue(l2.estValide(date));  //La licence l2 doit etre valide
	}
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
