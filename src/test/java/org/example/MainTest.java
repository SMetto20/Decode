package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void encodeCheker_stringInput_ArrayList(){
        Main main = new Main();
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("andy");
        assertEquals(expectedOutput, main.encodeWords(" "));
    }
    @Test
    public void decodeChecker_stringOutput_ArrayList(){
        Main secondary = new Main();
        List<String>expectedOutput =new ArrayList();
        expectedOutput.add("harry");
        assertEquals(expectedOutput,secondary.decodeWords(""));

    }

}