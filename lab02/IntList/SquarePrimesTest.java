package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(13, 14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("169 -> 14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimple2() {
        IntList lst = IntList.of(3, 4, 5, 6, 7);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("9 -> 4 -> 25 -> 6 -> 49", lst.toString());
        assertTrue(changed);
    }

     @Test
    public void testSquarePrimesSimple3() {
        IntList lst = IntList.of(13);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("169", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesSimple4() {
        IntList lst = IntList.of(10, 11, 12, 13);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("10 -> 121 -> 12 -> 169", lst.toString());
        assertTrue(changed);
    }
}
