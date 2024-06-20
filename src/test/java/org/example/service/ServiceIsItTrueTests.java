package org.example.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServiceIsItTrueTests {

    @Test
    void testCheckPalindromeString_Palindrome() {
        ServiceIsItTrue service = new ServiceIsItTrue();
        assertTrue(service.checkPalindromeString("madam"));
    }

    @Test
    void testCheckPalindromeString_NotPalindrome() {
        ServiceIsItTrue service = new ServiceIsItTrue();
        assertFalse(service.checkPalindromeString("hello"));
    }

    @Test
    void testCheckPalindromeString_EmptyString() {
        ServiceIsItTrue service = new ServiceIsItTrue();
        assertTrue(service.checkPalindromeString(""));
    }

    @Test
    void testCheckPalindromeString_SingleCharacter() {
        ServiceIsItTrue service = new ServiceIsItTrue();
        assertTrue(service.checkPalindromeString("a"));
    }

    @Test
    void testCheckPalindromeString_WithMock() {
        ServiceIsItTrue service = mock(ServiceIsItTrue.class);
        when(service.checkPalindromeString("racecar")).thenReturn(true);
        assertTrue(service.checkPalindromeString("racecar"));
    }
}
