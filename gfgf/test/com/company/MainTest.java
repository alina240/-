package com.company;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    int n1 = 5;
    int n2 = 3;

    @Test
    public void multiply() {
      assertEquals(Main.multiply(n1, n2), n1 * n2);
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

    @Test
    public void main()  {
        assertEquals(Main.multiply(n1, n2), n1 * n2);
    }
}