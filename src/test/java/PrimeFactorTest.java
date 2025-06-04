import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {
    PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    void name() {
        assertEquals(1, 1);
    }

    @Test
    void testPrimeFactorOf1() {
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    void testPrimeFacotrOf2() {
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }


    @Test
    void testPrimeFacotrOf3() {
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }

    @Test
    void testPrimeFacotrOf4() {
        assertEquals(Arrays.asList(2,2), primeFactor.of(4));
    }

    @Test
    void testPrimeFacotrOf6() {
        assertEquals(Arrays.asList(2,3), primeFactor.of(6));
    }

}
