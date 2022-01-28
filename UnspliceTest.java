// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)

public class UnspliceTest {

    @Test
    void unsplicerTest1() {
        String expected = "sleep";
        String actual = Unsplice.answer("slee\\\np");
        assertEquals(expected, actual);
    }
    
    @Test
    void unsplicerTest2() {
        String expected = "sleep";
        String actual = Unsplice.answer("sleep");
        assertEquals(expected, actual);
    }
    
    @Test
    void unsplicerTest3() {
        String expected = "slee\np";
        String actual = Unsplice.answer("slee\np");
        assertEquals(expected, actual);
    }
    
    @Test
    void unsplicerTest4() {
        String expected = "s\nleep\n";
        String actual = Unsplice.answer("s\nleep\n");
        assertEquals(expected, actual);
    }
}
