package com.pgu.books;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilsTest {

    @Test
    public void testReplaceAllWithSpanishCharacters() {

        assertTrue("az AZ 09".equals(replaceAll("az AZ 09")));
        assertTrue("".equals(replaceAll("¿?¡!./§,;:%*^$£&~#'{([|`><-_@)]=}+°²µ").trim()));
        assertTrue("ÁáÉéÍíÓóÚúÑñ".equals(replaceAll("ÁáÉéÍíÓóÚúÑñ")));
    }

    public String replaceAll(final String text) {
        return text.replaceAll("[^A-Za-z0-9 ÁáÉéÍíÓóÚúñÑ]", " ");
    }

}
