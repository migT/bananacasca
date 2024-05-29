package org.example.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
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
    public void testCheckPalindromeString_whenInputIsPalindrome_thenTrue() {
        String input = "madam";
        assertThat(service.checkPalindromeString(input)).isTrue();
    }

    @Test
    public void testCheckPalindromeString_whenInputIsNotPalindrome_thenFalse() {
        String input = "hello";
        assertThat(service.checkPalindromeString(input)).isFalse();
    }

    @Test
    public void testCheckPalindromeString_whenInputIsEmpty_thenTrue() {
        String input = "";
        assertThat(service.checkPalindromeString(input)).isTrue();
    }

    @Test
    public void testCheckPalindromeString_whenInputIsSingleCharacter_thenTrue() {
        String input = "a";
        assertThat(service.checkPalindromeString(input)).isTrue();
    }
}
