package com.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for the application greeting.
 */
public class AppTest extends TestCase
{
    public AppTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    public void testAppPrintsGreeting()
    {
        ByteArrayOutputStream capturedOutput = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(capturedOutput));
            App.main(new String[0]);
        } finally {
            System.setOut(originalOutput);
        }

        assertEquals("Hello World!", capturedOutput.toString().trim());
    }
}
