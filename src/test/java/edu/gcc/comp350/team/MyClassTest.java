package edu.gcc.comp350.team;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    @Test
    void addTwo() {
        assertEquals(7, MyClass.addTwo(5,2));
    }
}