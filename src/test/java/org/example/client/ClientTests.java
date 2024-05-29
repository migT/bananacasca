package org.example.client;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;

import org.example.service.ServiceIsItTrue;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Mock
    private ServiceIsItTrue serviceIsItTrue;

    @Test
    public void testEvaluatePalindrome() {
        String input = "onino";
        Mockito.when(serviceIsItTrue.checkPalindromeString(input)).thenReturn(true);

        evaluate(input);

        assertTrue(serviceIsItTrue.checkPalindromeString(input));
    }

    @Test
    public void testEvaluateNonPalindrome() {
        String input = "Txuba";
        Mockito.when(serviceIsItTrue.checkPalindromeString(input)).thenReturn(false);

        evaluate(input);

        assertFalse(serviceIsItTrue.checkPalindromeString(input));
    }

    private void evaluate(String input) {
        serviceIsItTrue.checkPalindromeString(input);
    }
}