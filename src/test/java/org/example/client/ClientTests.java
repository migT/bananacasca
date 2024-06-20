package org.example.client;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;

import org.example.service.ServiceIsItTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClientTests {

    @Test
    void testEvaluatePalindrome() {
        ServiceIsItTrue mockService = mock(ServiceIsItTrue.class);
        when(mockService.checkPalindromeString("onino")).thenReturn(true);

        assertTrue(mockService.checkPalindromeString("onino"));
    }

    @Test
    void testEvaluateNonPalindrome() {
        ServiceIsItTrue mockService = mock(ServiceIsItTrue.class);
        when(mockService.checkPalindromeString("Txuba")).thenReturn(false);

        assertFalse(mockService.checkPalindromeString("Txuba"));
    }
}
