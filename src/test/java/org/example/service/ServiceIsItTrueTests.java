package org.example.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ServiceIsItTrueTests {

    private ServiceIsItTrue service = new ServiceIsItTrue();

    @Test
    public void testCheckPalindromeString_whenPalindromeInput_thenTrue() {
        String input = "madam";
        boolean result = service.checkPalindromeString(input);
        assertThat(result).isTrue();
    }

    @Test
    public void testCheckPalindromeString_whenNonPalindromeInput_thenFalse() {
        String input = "hello";
        boolean result = service.checkPalindromeString(input);
        assertThat(result).isFalse();
    }

    @Test
    public void testCheckPalindromeString_whenEmptyInput_thenTrue() {
        String input = "";
        boolean result = service.checkPalindromeString(input);
        assertThat(result).isTrue();
    }
}