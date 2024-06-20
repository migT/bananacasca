package org.example.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceIsItTrueTests {

    private static ServiceIsItTrue service;

    @BeforeAll
    static void setUp() {
        service = new ServiceIsItTrue();
    }

    @Test
    void checkPalindromeString_WhenInputIsPalindrome_ReturnsTrue() {
        boolean result = service.checkPalindromeString("madam");
        assertThat(result).isTrue();
    }

    @Test
    void checkPalindromeString_WhenInputIsNotPalindrome_ReturnsFalse() {
        boolean result = service.checkPalindromeString("hello");
        assertThat(result).isFalse();
    }

    @Test
    void checkPalindromeString_WhenInputIsEmpty_ReturnsTrue() {
        boolean result = service.checkPalindromeString("");
        assertThat(result).isTrue();
    }

    @Test
    void checkPalindromeString_WhenInputIsSingleCharacter_ReturnsTrue() {
        boolean result = service.checkPalindromeString("a");
        assertThat(result).isTrue();
    }

    @Test
    void checkPalindromeString_WhenInputIsEvenLengthPalindrome_ReturnsTrue() {
        boolean result = service.checkPalindromeString("racecar");
        assertThat(result).isTrue();
    }

    @Test
    void checkPalindromeString_WhenInputIsOddLengthPalindrome_ReturnsTrue() {
        boolean result = service.checkPalindromeString("level");
        assertThat(result).isTrue();
    }
}
