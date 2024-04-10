package org.example.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ServiceIsItTrueTests {

    @Test
    public void testCheckPalindromeString_WhenInputIsPalindrome_ThenReturnTrue() {
        ServiceIsItTrue service = new ServiceIsItTrue();
        String input = "madam";
        boolean result = service.checkPalindromeString(input);
        assertThat(result).isTrue();
    }

    @Test
    public void testCheckPalindromeString_WhenInputIsNotPalindrome_ThenReturnFalse() {
        ServiceIsItTrue service = new ServiceIsItTrue();
        String input = "hello";
        boolean result = service.checkPalindromeString(input);
        assertThat(result).isFalse();
    }

    @Test
    public void testCheckPalindromeString_WhenInputIsEmpty_ThenReturnTrue() {
        ServiceIsItTrue service = new ServiceIsItTrue();
        String input = "";
        boolean result = service.checkPalindromeString(input);
        assertThat(result).isTrue();
    }
}