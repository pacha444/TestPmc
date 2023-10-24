
import static org.junit.jupiter.api.Assertions.*;

import org.example.Myprog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Principaltest {
    Myprog myprog;
    @BeforeEach
    public void init ()
    {
        myprog=new Myprog();

    }

    @Test
    @DisplayName("nombre divisible par 3")
    void testtrois() {


        String expected="9 vert";
        String result=myprog.divisibleby(9);
        assertEquals(expected,result, "The add method should add two numbers");
    }

    @Test
    @DisplayName("nombre divisible par 5")
    void testcinq() {


        String expected="10 bleu";
        String result=myprog.divisibleby(10);
        assertEquals(expected,result, "The add method should add two numbers");
    }

    @Test
    @DisplayName("nombre divisible par 3 et 5")
    void testtroisetcinq() {


        String expected="30 jaune";
        String result=myprog.divisibleby(30);
        assertEquals(expected,result, "The add method should add two numbers");
    }
}
