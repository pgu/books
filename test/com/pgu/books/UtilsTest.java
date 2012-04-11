package com.pgu.books;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilsTest {

    @Test
    public void testReplaceAllWithSpanishCharacters() {

        String text = "az AZ 09";
        text = text.replaceAll("[^A-Za-z0-9 ]", " ");

        assertTrue("az AZ 09".equals(text));
    }

}
