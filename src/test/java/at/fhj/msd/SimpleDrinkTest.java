package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * testclass for testing SimpleDrink
 * @author Emanuel Neziraj
 */
public class SimpleDrinkTest {

    /**
     * Create Object Drink
     */
    private Drink cola;
    /**
     * Create Object Drink
     */
    private Drink irishWhisky;

    /**
     * Test Setup creates assigns the created variables to new objects
     * @author Emanuel Neziraj
     */
    @BeforeEach
    public void setup(){
        Liquid whisky = new Liquid("Whisky", 2, 40);
        irishWhisky = new SimpleDrink("Irish Whisky", whisky);
        cola = new SimpleDrink("Coke", new Liquid("Coca Cola", 25, 0));
    }

    /**
     * tests if method isAlcoholic returns true when drink contains alcohol
     * @author Emanuel Neziraj
     */
    @Test
    public void isAlcoholicTest(){
        Assertions.assertTrue(irishWhisky.isAlcoholic());
    }

    /**
     * tests if method isAlcoholic returns falls when drink does not contain alcohol
     * @author Emanuel Neziraj
     */
    @Test
    public void isAlcoholicTest2(){
        Assertions.assertFalse(cola.isAlcoholic());
    }

    /**
     * tests if method getVolume returns the right volume of drink
     * @author Emanuel Neziraj
     */
    @Test
    public void getVolumeTest(){
        Assertions.assertEquals(2, irishWhisky.getVolume());
    }

    /**
     * tests if method getVolume returns the right volume of drink
     * @author Emanuel Neziraj
     */
    @Test
    public void getVolumeTest2(){
        Assertions.assertEquals(25, cola.getVolume());
    }

    /**
     * tests if method getAlcoholPercent returns the right alcohol percent of drink
     * @author Emanuel Neziraj
     */
    @Test
    public void getAlcoholPercentTest(){
        Assertions.assertEquals(40, irishWhisky.getAlcoholPercent());
    }

    /**
     * tests if method getAlcoholPercent returns the right alcohol percent of drink
     * @author Emanuel Neziraj
     */
    @Test
    public void getAlcoholPercentTest2(){
        Assertions.assertEquals(0, cola.getAlcoholPercent());
    }
}
