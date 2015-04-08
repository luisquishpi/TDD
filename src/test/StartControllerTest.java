package test;

import static org.junit.Assert.*;
import klondike.StartController;

import org.junit.Before;
import org.junit.Test;

public class StartControllerTest {

    StartController startController;
    
    @Before
    public void beforeTest(){
        startController=new StartController();
    }
    @Test
    public void isEmptyWaste() {
        assertTrue(startController.isEmptyWaste());
    }

}
