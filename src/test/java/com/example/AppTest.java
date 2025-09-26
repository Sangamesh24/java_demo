package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testHello() {
        assertEquals("Hello, Jenkins!", App.hello());
    }
}
