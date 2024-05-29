package org.example.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ServiceIsItTrueTests {

    @Mock
    private ServiceIsItTrue serviceIsItTrue;

    @Test
    public void testCheckPalindromeString_WhenPalindrome_ReturnsTrue() {
        String input = "madam";
        when(serviceIsItTrue.checkPalindromeString(input)).thenReturn(true);
        boolean result = serviceIsItTrue.checkPalindromeString(input);
        assertThat(result).isTrue();
    }

    @Test
    public void testCheckPalindromeString_WhenNotPalindrome_ReturnsFalse() {
        String input = "hello";
        when(serviceIsItTrue.checkPalindromeString(input)).thenReturn(false);
        boolean result = serviceIsItTrue.checkPalindromeString(input);
        assertThat(result).isFalse();
    }

    @Test
    public void testCheckPalindromeString_WhenEmptyString_ReturnsTrue() {
        String input = "";
        when(serviceIsItTrue.checkPalindromeString(input)).thenReturn(true);
        boolean result = serviceIsItTrue.checkPalindromeString(input);
        assertThat(result).isTrue();
    }
}
