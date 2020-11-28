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
    private Moniteur m1;
    private Club c1;
    private LocalDate date;
    
    private Licence l1;
    private Licence l2;
    
    @BeforeEach
    public void setUp() {
        personne1= new Personne("10","Garriga","Léandre","81100 Castres","0600000000",LocalDate.parse("2019-03-29"));
        personne2= new Personne("10","Némar","Jean","81100 Castres","0600000001",LocalDate.parse("2019-12-13"));
        //plongeur1= new plongeur
        //c1= new Club;
        //l1= new Licence(personne1, "01",);
        date=LocalDate.parse("2020-011-25");
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
