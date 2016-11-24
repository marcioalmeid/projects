/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.lsi.mam.jpomodairo.entities.PersistenceManager;
import br.lsi.mam.jpomodairo.entities.Pomodoro;
import br.lsi.mam.jpomodairo.model.PomodoroFacade;
import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author marcioam
 */
public class TestPersistenceManager {
    
    public TestPersistenceManager() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
         PomodoroFacade pomodoroFacade = new PomodoroFacade(Pomodoro.class);
        List<Pomodoro> pomodoros = pomodoroFacade.findAll();
         for(Pomodoro p : pomodoros){
             System.out.println("TestPersistenceManager.hello()"+ p .getName());
         }
     }
}
