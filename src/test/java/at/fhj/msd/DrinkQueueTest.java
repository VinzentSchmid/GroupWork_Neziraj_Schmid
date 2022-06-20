package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkQueueTest {
    private DrinkQueue queue;
    private Drink drink;
    private Liquid l;

    @BeforeEach
    public void setup(){
        queue = new DrinkQueue(5);
        l = new Liquid("Whisky", 2, 40);
        drink = new SimpleDrink("Whisky", l);
    }

    @Test
    public void simpleDrinkTest(){

    }

    @Test
    public void offerTest(){

    }

    @Test
    public void pollTest(){

    }

    @Test
    public void removeTest(){

    }

    @Test
    public void peekTest(){

    }

    @Test
    public void elementTest(){

    }
}
