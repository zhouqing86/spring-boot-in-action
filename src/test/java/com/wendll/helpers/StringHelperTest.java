package com.wendll.helpers;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {
    @Test
    public void isPalindrome() throws Exception {
        assertTrue(StringHelper.isPalindrome("aba"));
    }

    @Test
    public void testRemoveCharFromString() throws Exception {
        assertEquals("ab", StringHelper.removeChar("acbc", 'c'));

    }
}