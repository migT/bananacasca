package org.example.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ServiceIsItTrueTests {

    @Test
    public void testCheckPalindromeString_WhenInputIsPalindrome_ThenReturnTrue() {
        ServiceIsItTrue service = new ServiceIsItTrue();
        String input = "madam";
        assertTrue(service.checkPalindromeString(input));
    }

    @Test
    public void testCheckPalindromeString_WhenInputIsNotPalindrome_ThenReturnFalse() {
        ServiceIsItTrue service = new ServiceIsItTrue();
        String input = "hello";
        assertFalse(service.checkPalindromeString(input));
    }
}