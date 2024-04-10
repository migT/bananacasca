package org.example.client;

import org.example.service.ServiceIsItTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Test
    public void testEvaluatePalindrome() {
        // Arrange
        ServiceIsItTrue serviceIsItTrue = mock(ServiceIsItTrue.class);
        when(serviceIsItTrue.checkPalindromeString("onino")).thenReturn(true);

        // Act
        boolean result = serviceIsItTrue.checkPalindromeString("onino");

        // Assert
        assertTrue(result);
    }

    @Test
    public void testEvaluateNonPalindrome() {
        // Arrange
        ServiceIsItTrue serviceIsItTrue = mock(ServiceIsItTrue.class);
        when(serviceIsItTrue.checkPalindromeString("Txuba")).thenReturn(false);

        // Act
        boolean result = serviceIsItTrue.checkPalindromeString("Txuba");

        // Assert
        assertFalse(result);
    }
}