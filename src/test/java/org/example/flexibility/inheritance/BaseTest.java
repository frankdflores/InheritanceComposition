package org.example.flexibility.inheritance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class BaseTest {

    private final PrintStream systemOut;
    private ByteArrayOutputStream testOut;

    public BaseTest() {
        systemOut = System.out;
    }

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreOutput() {
        System.setOut(systemOut);
    }

    public String getOutput() {
        return testOut.toString();
    }
}
