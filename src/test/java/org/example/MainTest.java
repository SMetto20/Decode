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

}