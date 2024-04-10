package org.example.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ServiceIsItTrueTests {

    private static ServiceIsItTrue service;

    @BeforeAll
    public static void setup() {
        service = new ServiceIsItTrue();
    }

    @Test
    public void testCheckPalindromeString_whenInputIsPalindrome_shouldReturnTrue() {
        String input = "madam";
        boolean result = service.checkPalindromeString(input);
        assertThat(result).isTrue();
    }

    @Test
    public void testCheckPalindromeString_whenInputIsNotPalindrome_shouldReturnFalse() {
        String input = "hello";
        boolean result = service.checkPalindromeString(input);
        assertThat(result).isFalse();
    }

    @Test
    public void testCheckPalindromeString_whenInputIsEmpty_shouldReturnTrue() {
        String input = "";
        boolean result = service.checkPalindromeString(input);
        assertThat(result).isTrue();
    }
}
