package com.example.demo;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class MathTest {

    @Test
    public void testAdd() {
        Calculatrice math = new Calculatrice();
        int result = math.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testMulti() {
        Calculatrice math = new Calculatrice();
        int result = math.multi(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDiv() {
        Calculatrice math = new Calculatrice();
        int result = math.div(10, 2);
        assertEquals(5, result);
    }
}
