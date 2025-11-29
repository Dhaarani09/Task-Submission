package com.junit.com.AppTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void sayHelloTest() {
        String expected = "Hello";
        String actual = new App().sayHello();
        assertEquals(expected, actual);
    }
}
